package com.xhxy.eshop.mapper;

import com.xhxy.eshop.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
	// 添加用户（注册）
	public Integer addUser(User user);
	// 登录login
	public Integer login(@Param("username") String username,@Param("password") String password);
	// 查询用户
	public User findById(int id);
	// 修改用户信息
	public Integer update(User user);
	// 用id获取密码
	public String findPasswordById(int id);
}
