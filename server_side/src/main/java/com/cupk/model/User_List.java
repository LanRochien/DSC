package com.cupk.model;

import com.cupk.pojo.Resp;
import com.cupk.pojo.User;
import lombok.Data;

import java.util.List;

/**
 * 名称User_List
 * 描述
 *
 * @version 1.0
 * @author:Liu JiaQi
 * @datatime:2023-06-30 16:12
 */
@Data
public class User_List {
    private List<User> users;
    private Resp resp;
}
