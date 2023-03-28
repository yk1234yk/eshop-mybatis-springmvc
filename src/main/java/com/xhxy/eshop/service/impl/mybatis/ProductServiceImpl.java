package com.xhxy.eshop.service.impl.mybatis;

import com.xhxy.eshop.entity.Product;
import com.xhxy.eshop.mapper.ProductMapper;
import com.xhxy.eshop.service.ProductService;
import com.xhxy.eshop.util.MybatisUtils;

import java.util.List;

public class ProductServiceImpl implements ProductService {
	
	private ProductMapper productMapper = MybatisUtils.getSession().getMapper(ProductMapper.class);
	
	@Override
	public Product findById(Integer id) {
		return productMapper.findById(id);
	}

	@Override
	public List<Product> findListByCategoryId(Integer categoryId) {
		return productMapper.findListByCategoryId(categoryId);
	}

	@Override
	public List<Product> findAll() {
		return productMapper.findAll();
	}

	@Override
	public List<Product> findHot(Integer n) {
		return productMapper.findHot(n);
	}

	@Override
	public List<Product> findLatest(Integer n) {
		return productMapper.findLatest(n);
	}

	@Override
	public List<Product> findByKeywords(String name, String brief, String detail) {
		// 暂未实现
		return null;
	}

}
