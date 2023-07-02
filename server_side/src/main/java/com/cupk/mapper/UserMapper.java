package com.cupk.mapper;

import com.cupk.pojo.User;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserMapper {
    User findByID(Integer id);

    List<User> findAllUsers();
    int addUser(User user);
    @Select("select * from t_user where name=#{name}")
    User getUserByName(String name);//通过用户名查询主页信息
    int register (User user);
    int deleteUserById(int id);
    Boolean banUserById(int id,int role);//禁用用户
    Integer selectRoleByName(String name);
    User login(String name,String password);
    @Update("update t_user set post_qty=#{post_qty} where name = #{name}")
    Integer updatePostCount(String name,int post_qty);
    @Update("update t_user set reply_qty=#{reply_qty} where name = #{name}")
    Integer updateReplyCount(String name,int reply_qty);
}
