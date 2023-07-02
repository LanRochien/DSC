package com.cupk.model;

import com.cupk.pojo.*;
import lombok.Data;

import java.util.List;

/**
 * 名称Profile
 * 描述个人中心
 *
 * @version 1.0
 * @author:Liu JiaQi
 * @datatime:2023-06-30 16:16
 */
@Data
public class Profile {
    private User user;
    private List<Post> posts;
    private List<Comment> comments;
    private Resp resp;
}
