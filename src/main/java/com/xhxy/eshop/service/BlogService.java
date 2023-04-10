package com.xhxy.eshop.service;

import com.xhxy.eshop.entity.Blog;
import com.xhxy.eshop.interceptor.Page;

import java.util.List;

public interface BlogService {
	// 查询全部推荐文章
	List<Blog> findAll();
	
	// 查询最新的多篇推荐文章：用于首页显示用
	List<Blog> findLatestBlog(Integer rows);
	
	// 查询某篇推荐文章
	Blog findByBlogId(Integer blogId);

	//
	List<Blog> findByPage(Page page);
}
