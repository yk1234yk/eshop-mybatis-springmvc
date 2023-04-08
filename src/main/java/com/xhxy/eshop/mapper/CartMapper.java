package com.xhxy.eshop.mapper;

import com.xhxy.eshop.entity.Cart;
import org.apache.ibatis.annotations.Param;

public interface CartMapper {
	// 新建购物车（用户注册成功后，立即新建一个购物车）
//	public Integer add(Integer userId);
	
	// 根据用户Id，返回Cart
	public Cart findById(Integer id);
	
	// 根据用户Id，返回Cart
	public Cart findByUserId(Integer userId);
	
	// 更改某个cart的total总价
	public Integer updateTotal(@Param("cartId") Integer cartId,@Param("cartTotal") Float cartTotal);
}
