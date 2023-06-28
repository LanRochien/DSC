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
    @Select("select * from t_user where name=#{name}")
    @Results({@Result(column = "name",property = "name"),
            @Result(column = "sex",property = "sex"),
            @Result(column = "birthday",property = "birthday"),
            @Result(column = "job",property = "job"),
            @Result(column = "post_qty",property = "post_num"),
            @Result(column = "reply_qty",property = "replay_num"),
            @Result(column = "record_date",property = "record_date"),
            @Result(column = "location",property = "location"),
            @Result(column = "vol_tag",property = "vol_tag"),
            @Result(column = "age" ,property = "age")
    })
    User getUserByName(String name);//通过用户名查询主页信息

    int register (User user);

    int deleteUserById(int id);

    int login(String name,String password);
}
