package com.cupk.model;

import com.cupk.pojo.Comment;
import com.cupk.pojo.Post;
import com.cupk.pojo.Resp;
import lombok.Data;

import java.util.List;

/**
 * 名称post_model
 * 描述
 *
 * @version 1.0
 * @author:Liu JiaQi
 * @datatime:2023-07-01 05:11
 */
@Data
public class post_model {
    private Post post;
    private List<Comment> comments;
    private Resp resp;
}
