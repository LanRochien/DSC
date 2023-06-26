package com.cupk.service.impl;

import com.cupk.mapper.UserMapper;
import com.cupk.pojo.User;
import com.cupk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 名称UserServiceimpl
 * 描述
 *
 * @version 1.0
 * @author:Liu JiaQi
 * @datatime:2023-06-25 19:01
 */
@Service
@Primary
public class UserServiceimpl implements UserService {
    @Autowired(required = false)
    private UserMapper userMapper;
    @Override
    public User findByID(Integer id) {
        return userMapper.findByID(id);
    }

    @Override
    public List<User> findAllUsers() {
        return userMapper.findAllUsers();
    }

    @Override
    public User getUserByName(String name) {
        return userService.getUserByName(name);
    }
}
