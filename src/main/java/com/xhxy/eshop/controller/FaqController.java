package com.xhxy.eshop.controller;

import com.xhxy.eshop.entity.Faq;
import com.xhxy.eshop.mapper.FaqMapper;
import com.xhxy.eshop.util.MybatisUtils;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

// 常见问题Faq：列表
@WebServlet("/faq")
public class FaqController  extends BaseServlet {

	private FaqMapper faqService = MybatisUtils.getSession().getMapper(FaqMapper.class);
	
	public String index(HttpServletRequest request, HttpServletResponse response) {
		List<Faq> faqs = faqService.findAll();
		
		request.setAttribute("faqs", faqs);
		return "faq.jsp";
	}
}
