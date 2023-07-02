package com.cupk.mapper;
import com.cupk.pojo.Comment;
import com.cupk.pojo.Plate;
import com.cupk.pojo.Post;
import com.cupk.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface CommentMapper {
    @Select("select * from t_comment where mainpost_id=(select id from t_post where id = #{id})")
    @Results({
            @Result(property = "id",column = "id"),
            @Result(property = "content",column = "content"),
            @Result(property = "date_time",column = "date_time"),
            @Result(property = "up_qty",column = "up_qty"),
            @Result(property = "post",column = "mainpost_id",javaType = Post.class,
                    one = @One(select = "com.cupk.mapper.PostMapper.findPostById")),
            @Result(property = "user",column = "user_id",javaType = User.class,
                    one = @One(select = "com.cupk.mapper.UserMapper.findByID")),
    })
    List<Comment> findCommentsByPostID(Integer id);//通posIDt查找comments
    int upComment(int id);
    @Select("select * from t_comment where user_id=(select id from t_user where name = #{name})")
    @Results({
            @Result(property = "id",column = "id"),
            @Result(property = "content",column = "content"),
            @Result(property = "date_time",column = "date_time"),
            @Result(property = "up_qty",column = "up_qty"),
            @Result(property = "post",column = "mainpost_id",javaType = Post.class,
                    one = @One(select = "com.cupk.mapper.PostMapper.findPostById")),
            @Result(property = "user",column = "user_id",javaType = User.class,
                    one = @One(select = "com.cupk.mapper.UserMapper.findByID")),
    })
    List<Comment> findCommentsByUserName(String name);//通过用户名找comments
    Integer insertComment(Comment comment);
    int delCommentByIds(long... ids);//批量删除回复

}
