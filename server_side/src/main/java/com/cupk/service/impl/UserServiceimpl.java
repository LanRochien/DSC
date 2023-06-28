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
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public User getUserByName(String name) {
        return userMapper.getUserByName(name);
    }

    @Override
    public int register(User user) {
        return userMapper.register(user);
    }

    @Override
    public int deleteUserById(int id){
        return userMapper.deleteUserById(id);
    }

    @Override
    public int login(String name, String password) {
        return userMapper.login(name,password);
    }
}
