package com.cupk.service;

import com.cupk.pojo.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> findCommentsByPostID(Integer post_id);//通过posIDt查找comments
    int insertComment(Comment comment);//提交comment
}
