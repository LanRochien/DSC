package com.cupk.service.impl;

import com.cupk.mapper.UserMapper;
import com.cupk.pojo.User;
import com.cupk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
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
    public Boolean banUserById(int id,int role) {
        return userMapper.banUserById(id,role);
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
    public Integer selectRoleByName(String name) {
        return userMapper.selectRoleByName(name);
    }

    @Override
    public User login(String name, String password) {
        String strDateFormat = "yyyy-MM-dd";
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
        sdf.format(userMapper.login(name,password).getBirthday());
        userMapper.login(name,password).setBirthday(userMapper.login(name,password).getBirthday());
        sdf.format(userMapper.login(name,password).getRecord_date());
        userMapper.login(name,password).setRecord_date(userMapper.login(name,password).getRecord_date());
        return userMapper.login(name,password);
    }

    @Override
    public Integer updatePostCount(String name, int post_qty) {
        return userMapper.updatePostCount(name,post_qty);
    }

    @Override
    public Integer updateReplyCount(String name, int reply_qty) {
        return userMapper.updatePostCount(name,reply_qty);
    }
}
