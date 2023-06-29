package com.cupk.mapper;

import com.cupk.pojo.User;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    User findByID(Integer id);

    List<User> findAllUsers();
    int addUser(User user);

    int register (User user);

    int deleteUserById(int id);

    int login(String name,String password);
}
