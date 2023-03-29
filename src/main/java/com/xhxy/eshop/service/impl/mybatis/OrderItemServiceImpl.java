package com.xhxy.eshop.service.impl.mybatis;

import com.xhxy.eshop.entity.OrderItem;
import com.xhxy.eshop.mapper.OrderItemMapper;
import com.xhxy.eshop.service.OrderItemService;
import com.xhxy.eshop.util.MybatisUtils;

import java.util.List;

public class OrderItemServiceImpl implements OrderItemService {

	private OrderItemMapper orderItemMapper = MybatisUtils.getSession().getMapper(OrderItemMapper.class);
	
	@Override
	public List<OrderItem> findByOrderId(Integer orderId) {
		return orderItemMapper.findByOrderId(orderId);
	}

	@Override
	public Integer save(OrderItem orderItem) {
		return orderItemMapper.save(orderItem);
	}

}
