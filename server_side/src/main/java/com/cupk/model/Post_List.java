package com.cupk.model;

import com.cupk.pojo.Post;
import com.cupk.pojo.Resp;
import lombok.Data;

import java.util.List;

/**
 * 名称Post_List
 * 描述
 *
 * @version 1.0
 * @author:Liu JiaQi
 * @datatime:2023-06-30 00:24
 */
@Data
public class Post_List {
    private List<Post> posts;
    private Resp resp;
}
