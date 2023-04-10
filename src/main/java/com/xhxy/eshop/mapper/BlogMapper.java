package com.xhxy.eshop.mapper;

import com.xhxy.eshop.entity.Blog;
import com.xhxy.eshop.interceptor.Page;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BlogMapper {
	
	// 查询全部推荐文章
	List<Blog> findAll();
	
	// 查询最新的n篇推荐文章：用于首页显示用
	List<Blog> findLatestBlog(Integer n);
	
	// 查询某篇推荐文章
	Blog findById(Integer blogId);

	//查询全部推荐文章（分页）
	List<Blog> findByPage(@Param("page")Page page);
}
