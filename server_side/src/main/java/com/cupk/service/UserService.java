package com.cupk.service;

import com.cupk.pojo.User;
import lombok.AllArgsConstructor;

import java.util.List;

public interface UserService {
    User findByID(Integer id);//通过id找用户
    List <User> findAllUsers(); //找到全部用户
    int addUser(User user);//添加用户
    User getUserByName(String name);//通过用户名查询主页信息

    int register(User user);
    int deleteUserById(int id);

    int login(String uname, String pwd);
}
