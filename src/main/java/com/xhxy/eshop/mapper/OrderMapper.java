package com.xhxy.eshop.mapper;

import com.xhxy.eshop.entity.Address;
import com.xhxy.eshop.entity.Cart;
import com.xhxy.eshop.entity.Order;
import com.xhxy.eshop.entity.OrderItem;

import java.util.List;

public interface OrderMapper {
	
	// 根据用户id获取其全部的Order ：订单列表页
	public List<Order> getByUserId(Integer userId);
	
	// 根据订单id获取Order ：订单详情页
	public Order findById(Integer orderId);
	
	
	// 从购物车对象生成订单
	public Integer saveFromCart(Cart cart,Address address);
	
	// 保存（插入）一个Order订单(完整数据)，返回新插入的id值（自增长）
	public Integer save(Order order);

	//保存（插入）多个OrderItem：从购物车--> 订单
	public Integer batchSave(List<OrderItem> orderItemList);
}
