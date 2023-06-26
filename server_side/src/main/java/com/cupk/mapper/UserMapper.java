package com.cupk.mapper;

import com.cupk.pojo.User;

import java.util.List;

public interface UserMapper {
    User findByID(Integer id);

    List<User> findAllUsers();
}
