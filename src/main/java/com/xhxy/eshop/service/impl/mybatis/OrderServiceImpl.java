package com.xhxy.eshop.service.impl.mybatis;

import com.xhxy.eshop.dao.CartDao;
import com.xhxy.eshop.dao.CartItemDao;
import com.xhxy.eshop.dao.impl.CartDaoImpl;
import com.xhxy.eshop.dao.impl.CartItemDaoImpl;
import com.xhxy.eshop.entity.*;
import com.xhxy.eshop.mapper.OrderItemMapper;
import com.xhxy.eshop.mapper.OrderMapper;
import com.xhxy.eshop.service.OrderService;
import com.xhxy.eshop.util.MybatisUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderServiceImpl implements OrderService{

	private OrderMapper orderMapper = MybatisUtils.getSession().getMapper(OrderMapper.class);
	private OrderItemMapper orderItemMapper = MybatisUtils.getSession().getMapper(OrderItemMapper.class);
	private CartDao cartDao = new CartDaoImpl();
	private CartItemDao cartItemDao = new CartItemDaoImpl();

	// 从购物车 生成 订单
	@Override
	public Integer createOrder(Cart cart, Address address) {//address未使用
		// 1.从用户id获取Cart
		//Cart cart = cartMapper.findByUserId(cartId);
		
		// 2.从Cart生成Order
		Order order = new Order();
		order.setStatus(Status.Completed);
		order.setAddress(address);
		order.setCreateTime(new Date());
		order.setTotal(cart.getTotal());
		order.setUser(cart.getUser());
		
		// 3.保存（插入）该Order，获得新插入的id值（自增长）
		Integer orderId =  orderMapper.save(order);
		
		order = orderMapper.findById(orderId);
		
		// 4.取得cart中的所有cartItem
		List<CartItem> cartItemList = cartItemDao.findByCartId(cart.getId());
		List<OrderItem> orderItemList = new ArrayList<OrderItem>();
		
		// 5.将cartItem转为orderItem，并放入List中
		for(CartItem cartItem:cartItemList) {
			OrderItem orderItem = new OrderItem();
			orderItem.setOrder(order);
			orderItem.setProduct(cartItem.getProduct());
			orderItem.setQuantity(cartItem.getQuantity());
			orderItem.setTotal(cartItem.getTotal());
			
//			orderItemMapper.save(orderItem);	// 用for循环来批量插入
			orderItemList.add(orderItem);
		}
		
		// 6.保存（批量插入）cartItemList
		orderItemMapper.batchSave(orderItemList);	// 用mybatis的foreach批量插入
		
		// 7.清空购物车
		// 7.1. 先删除 该cart中的所有cartItem项
		cartItemDao.deleteByCartId(cart.getId());
				
		// 7.2. 再将该cart的total项设为0
		cartDao.updateTotal(cart.getId(), 0.0F);
		
		return orderId;
	}

	@Override
	public List<Order> getByUserId(Integer userId) {
		return orderMapper.getByUserId(userId); 
	}

	@Override
	public Order findById(Integer orderId) {
		return orderMapper.findById(orderId);
	}

}
