package com.cupk.service;

import com.cupk.pojo.User;

import java.util.List;

public interface UserService {
    User findByID(Integer id);//通过id找用户
    List <User> findAllUsers(); //找到全部用户
}
