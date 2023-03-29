package com.xhxy.eshop.service.impl.mybatis;

import com.xhxy.eshop.entity.Category;
import com.xhxy.eshop.mapper.CategoryMapper;
import com.xhxy.eshop.service.CategoryService;
import com.xhxy.eshop.util.MybatisUtils;

import java.util.List;

public class CategoryServiceImpl implements CategoryService {

	private CategoryMapper categoryMapper = MybatisUtils.getSession().getMapper(CategoryMapper.class);
	
	@Override
	public Category findById(Integer id) {
		return categoryMapper.findById(id);
	}

	@Override
	public List<Category> findAll() {
		return categoryMapper.findAll();
	}

	@Override
	public List<Category> findTopCategory() {
		return categoryMapper.findTopCategory();
	}

}
