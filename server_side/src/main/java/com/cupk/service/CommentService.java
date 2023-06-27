package com.cupk.service;

import com.cupk.pojo.Comment;
import com.cupk.pojo.Post;

import java.util.List;

public interface CommentService {
    List<Comment> findCommentsByPostID(Integer post_id);//通posIDt查找comments
}
