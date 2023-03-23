package com.xhxy.eshop.service.impl.mybatis;

import com.xhxy.eshop.entity.Faq;
import com.xhxy.eshop.mapper.FaqMapper;
import com.xhxy.eshop.service.FaqService;
import com.xhxy.eshop.util.MybatisUtils;

import java.util.List;

public class FaqServiceImpl implements FaqService {

	private FaqMapper faqMapper = MybatisUtils.getSession().getMapper(FaqMapper.class);
	
	@Override
	public List<Faq> findAll() {
		return faqMapper.findAll();
	}

}
