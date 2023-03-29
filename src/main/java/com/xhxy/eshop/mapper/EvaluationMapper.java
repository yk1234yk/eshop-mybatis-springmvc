package com.xhxy.eshop.mapper;

import com.xhxy.eshop.entity.Evaluation;

import java.util.List;

public interface EvaluationMapper {
	// 查询某商品的全部评价evaluation
	public List<Evaluation> findByProductId(Integer productId);
}
