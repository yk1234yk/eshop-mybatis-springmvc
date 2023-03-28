package com.xhxy.eshop.mapper;

import com.xhxy.eshop.entity.Product;

import java.util.ArrayList;
import java.util.List;

public interface ProductMapper {
	
	// 根据id查询商品  详情页
	public Product findById(Integer id);
	
	// 根据分类id号，查找所有的商品  分类页
	public ArrayList<Product> findListByCategoryId(Integer categoryId);
	
	// 查询全部商品  分类页
	public List<Product> findAll();
	
	// 查询前n件热销商品  首页
	public List<Product> findHot(Integer n);
	
	// 查询前n件新品  首页
	public List<Product> findLatest(Integer n);
}
