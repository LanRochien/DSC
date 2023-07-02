package com.cupk.service;

import com.cupk.pojo.Comment;
import com.cupk.pojo.Post;

import java.util.List;

public interface CommentService {
    List<Comment> findCommentsByPostID(Integer id);//通过posIDt查找comments
    int upComment(int id);
    List<Comment> findCommentsByUserName(String name);//通过用户名找comments
    Integer insertComment(Comment comment);
    int delCommentByIds(long... ids);//批量删除回复
}
