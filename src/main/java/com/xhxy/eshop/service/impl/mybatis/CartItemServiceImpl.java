package com.xhxy.eshop.service.impl.mybatis;

import com.xhxy.eshop.entity.CartItem;
import com.xhxy.eshop.mapper.CartItemMapper;
import com.xhxy.eshop.service.CartItemService;
import com.xhxy.eshop.util.MybatisUtils;

import java.util.List;

public class CartItemServiceImpl implements CartItemService {

	private CartItemMapper cartItemMapper = MybatisUtils.getSession().getMapper(CartItemMapper.class);
	
	@Override
	public List<CartItem> findByCartId(Integer cartId) {
		return cartItemMapper.findByCartId(cartId);
	}

}
