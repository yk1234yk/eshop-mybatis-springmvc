package com.xhxy.eshop.mapper;


import com.xhxy.eshop.entity.Category;

import java.util.List;

public interface CategoryMapper {
	// 获取某个id号的分类:商品详情页
	public Category findById(Integer id);
	
	// 获取全部的分类项:商品分类页
	public List<Category> findAll();
	
	// 获取顶层分类项:商品分类页
	public List<Category> findTopCategory();
	
	// 获取某顶层分类项的所有子层分类:商品分类页
	public List<Category> findChildCategory(Integer parentId);
}
