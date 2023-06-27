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
@Primary
@Service
public class CommentServiceimpl implements CommentService {
    @Autowired(required = false)
    CommentMapper commentMapper;
    @Override
    public List<Comment> findCommentsByPostID(Integer post_id) {
        return commentMapper.findCommentsByPostID(post_id);
    }
}
