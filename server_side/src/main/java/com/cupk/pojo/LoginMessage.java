package com.cupk.pojo;

import lombok.Data;

import java.util.List;
@Data
public class LoginMessage {
    private Integer id; //用户编号
    private String password; //密码
    private Boolean role; //用户角色
    List<User> UserList; //外键用户名
}
