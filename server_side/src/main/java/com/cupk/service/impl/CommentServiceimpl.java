package com.cupk.service.impl;

import com.cupk.mapper.CommentMapper;
import com.cupk.pojo.Comment;
import com.cupk.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * 名称CommentServiceimpl
 * 描述
 *
 * @version 1.0
 * @author:LANKEREN
 * @datatime:2023-06-27 19:11
 */
@Service
@Primary
public class CommentServiceimpl implements CommentService {
    @Autowired(required = false)
    CommentMapper commentMapper;
    @Override
    public List<Comment> findCommentsByPostID(Integer id) {
        return commentMapper.findCommentsByPostID(id);
    }

    @Override
    public int upComment(int id) {
        return commentMapper.upComment(id);
    }

    @Override
    public List<Comment> findCommentsByUserName(String name) {
        return commentMapper.findCommentsByUserName(name);
    }

    @Override
    public Integer insertComment(Comment comment) {
        return commentMapper.insertComment(comment);
    }

    @Override
    public int delCommentByIds(long... ids) {
        return commentMapper.delCommentByIds(ids);
    }

}

