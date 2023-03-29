package com.xhxy.eshop.service.impl.mybatis;

import com.xhxy.eshop.entity.Evaluation;
import com.xhxy.eshop.mapper.EvaluationMapper;
import com.xhxy.eshop.service.EvaluationService;
import com.xhxy.eshop.util.MybatisUtils;

import java.util.List;

public class EvaluationServiceImpl implements EvaluationService {

	private EvaluationMapper evaluationMapper = MybatisUtils.getSession().getMapper(EvaluationMapper.class);
	
	@Override
	public List<Evaluation> findByProductId(Integer productId) {
		return evaluationMapper.findByProductId(productId);
	}

}
