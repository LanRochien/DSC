package com.cupk.mapper;

import com.cupk.pojo.Comment;
import com.cupk.pojo.Post;

import java.util.List;

public interface CommentMapper {
    List<Comment> findCommentsByPostID(Integer post_id);//通posIDt查找comments
}
