package com.cupk.service;

import com.cupk.pojo.Post;
import com.cupk.pojo.User;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserService {
    User findByID(Integer id);//通过id找用户
    List <User> findAllUsers(); //找到全部用户
    int addUser(User user);//添加用户
    User getUserByName(String name);//通过用户名查询主页信息

    Boolean banUserById(int id,int role);//禁用用户
    int register(User user);
    int deleteUserById(int id);
    Integer selectRoleByName(String name);
    User login(String uname, String pwd);
    Integer updatePostCount(String name,int post_qty);
    Integer updateReplyCount(String name,int reply_qty);

}
