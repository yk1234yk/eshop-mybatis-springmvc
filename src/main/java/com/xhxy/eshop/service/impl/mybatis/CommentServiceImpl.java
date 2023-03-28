package com.xhxy.eshop.service.impl.mybatis;

import com.xhxy.eshop.entity.Comment;
import com.xhxy.eshop.mapper.CommentMapper;
import com.xhxy.eshop.service.CommentService;
import com.xhxy.eshop.util.MybatisUtils;

public class CommentServiceImpl implements CommentService {

	private CommentMapper commentMapper = MybatisUtils.getSession().getMapper(CommentMapper.class);
	
	@Override
	public Integer save(Comment comment) {
		return commentMapper.save(comment);
	}

}
