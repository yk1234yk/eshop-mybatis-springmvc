package com.xhxy.eshop.service.impl.mybatis;

import com.xhxy.eshop.dao.CartDao;
import com.xhxy.eshop.dao.impl.CartDaoImpl;
import com.xhxy.eshop.entity.User;
import com.xhxy.eshop.mapper.UserMapper;
import com.xhxy.eshop.service.UserService;
import com.xhxy.eshop.util.MybatisUtils;

public class UserServiceImpl implements UserService {

	private UserMapper userMapper = MybatisUtils.getSession().getMapper(UserMapper.class);    // 需要用到下层的userMapper和CartDao
	private CartDao cartDao = new CartDaoImpl();
	
	@Override
	public Integer addUser(User user) {
		Integer userId = userMapper.addUser(user);	// 返回新增用户的id
		cartDao.add(userId);	// 在cart购物车表中，新增该用户的购物车行
		return 1;
	}

	@Override
	public Integer login(String username, String password) {
		return userMapper.login(username, password);
	}

	@Override
	public User findById(int id) {
		return userMapper.findById(id);
	}

	@Override
	public Integer update(User user) {
		return userMapper.update(user);
	}

	@Override
	public String findPasswordById(int id) {
		return userMapper.findPasswordById(id);
	}

}
