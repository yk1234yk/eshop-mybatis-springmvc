package com.xhxy.eshop.service.impl.mybatis;

import com.xhxy.eshop.entity.Blog;
import com.xhxy.eshop.mapper.BlogMapper;
import com.xhxy.eshop.service.BlogService;
import com.xhxy.eshop.util.MybatisUtils;

import java.util.List;

public class BlogServiceImpl implements BlogService {

	private BlogMapper blogMapper = MybatisUtils.getSession().getMapper(BlogMapper.class);
	@Override
	public List<Blog> findAll() {
		return blogMapper.findAll();
	}
	@Override
	public Blog findByBlogId(Integer blogId) {
		return blogMapper.findById(blogId);
	}
	@Override
	public List<Blog> findLatestBlog(Integer rows) {
		return blogMapper.findLatestBlog(rows);
	}

}
