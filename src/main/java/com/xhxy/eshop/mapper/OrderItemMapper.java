package com.xhxy.eshop.mapper;

import com.xhxy.eshop.entity.OrderItem;

import java.util.List;

public interface OrderItemMapper {
	// 根据id获取:订单详情页
	public List<OrderItem> findByOrderId(Integer orderId);
	
	// 保存（插入）一个OrderItem :加入订单
	public Integer save(OrderItem orderItem);
	
	// 保存（插入）多个OrderItem :从购物车-->订单
	public Integer batchSave(List<OrderItem> orderItemList);
	
}
