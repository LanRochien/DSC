package com.cupk.mapper;
import com.cupk.pojo.Comment;

import java.util.List;

public interface CommentMapper {
    List<Comment> findCommentsByPostID(Integer post_id);//通posIDt查找comments
    int insertComment(Comment comment);//提交comment
}
