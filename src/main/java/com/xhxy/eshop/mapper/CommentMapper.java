package com.xhxy.eshop.mapper;

import com.xhxy.eshop.entity.Comment;

import java.util.List;

public interface CommentMapper {
    //	根据id查询某篇推荐文章的某个评论
    Comment findById(Integer id);

    // 查询某篇推荐文章的全部评论comment
    List<Comment> findByBlogId(Integer blogId);

    // 保存某用户对某文章的评论 comment
    int save(Comment comment);
}
