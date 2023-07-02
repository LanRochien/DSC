package com.cupk.mapper;

import com.cupk.pojo.Plate;
import com.cupk.pojo.Post;
import com.cupk.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface PostMapper {
    int clickPost(int id);//点击post
    int upPost(int id);//为post点赞
    int countReply(int id);//记录回复数
    @Select("select * from t_post where plate_id = (select id from t_plate where id = #{id})")
    @Results({
            @Result(property = "id",column = "id"),
            @Result(property = "reply_qty",column = "reply_qty"),
            @Result(property = "click_qty",column = "click_qty"),
            @Result(property = "up_qty",column = "up_qty"),
            @Result(property = "title",column = "title"),
            @Result(property = "content",column = "content"),
            @Result(property = "date_time",column = "date_time"),
            @Result(property = "user",column = "user_id",javaType = User.class,
                    one = @One(select = "com.cupk.mapper.UserMapper.findByID")),
            @Result(property = "plate",column = "plate_id",javaType = Plate.class,
                    one = @One(select = "com.cupk.mapper.PlateMapper.findPlateById")),
    })
    List<Post> getMainPostsByPlateID(Integer id);//通过版号查询所有主题帖
    @Select("select * from t_post")
    @Results({
            @Result(property = "id",column = "id"),
            @Result(property = "reply_qty",column = "reply_qty"),
            @Result(property = "click_qty",column = "click_qty"),
            @Result(property = "up_qty",column = "up_qty"),
            @Result(property = "title",column = "title"),
            @Result(property = "content",column = "content"),
            @Result(property = "date_time",column = "date_time"),
            @Result(property = "user",column = "user_id",javaType = User.class,
                    one = @One(select = "com.cupk.mapper.UserMapper.findByID")),
            @Result(property = "plate",column = "plate_id",javaType = Plate.class,
                    one = @One(select = "com.cupk.mapper.PlateMapper.findPlateById")),
    })
    List<Post> getAllPosts();//通过版号查询所有主题帖
    @Select("select * from t_post where user_id=(select id from t_user where name=#{name})")
    @Results({
            @Result(property = "id",column = "id"),
            @Result(property = "reply_qty",column = "reply_qty"),
            @Result(property = "click_qty",column = "click_qty"),
            @Result(property = "up_qty",column = "up_qty"),
            @Result(property = "title",column = "title"),
            @Result(property = "content",column = "content"),
            @Result(property = "date_time",column = "date_time"),
            @Result(property = "user",column = "user_id",javaType = User.class,
                    one = @One(select = "com.cupk.mapper.UserMapper.findByID")),
            @Result(property = "plate",column = "plate_id",javaType = Plate.class,
                    one = @One(select = "com.cupk.mapper.PlateMapper.findPlateById")),
    })
    List<Post> getMainPostsByUserName(String name);//通过名字查询所有主题帖

    int insertMainPost(Post post);//插入主题帖
    @Select("select * from t_post where title like CONCAT('%',#{Str},'%')")
    @Results({
            @Result(property = "id",column = "id"),
            @Result(property = "reply_qty",column = "reply_qty"),
            @Result(property = "click_qty",column = "click_qty"),
            @Result(property = "up_qty",column = "up_qty"),
            @Result(property = "title",column = "title"),
            @Result(property = "content",column = "content"),
            @Result(property = "date_time",column = "date_time"),
            @Result(property = "user",column = "user_id",javaType = User.class,
                    one = @One(select = "com.cupk.mapper.UserMapper.findByID")),
            @Result(property = "plate",column = "plate_id",javaType = Plate.class,
                    one = @One(select = "com.cupk.mapper.PlateMapper.findPlateById")),
    })
    List<Post> findPostsByStr(String Str);//论坛的模糊搜索
    @Select("select * from t_post where id = #{id}")
    @Results({
            @Result(property = "id",column = "id"),
            @Result(property = "reply_qty",column = "reply_qty"),
            @Result(property = "click_qty",column = "click_qty"),
            @Result(property = "up_qty",column = "up_qty"),
            @Result(property = "title",column = "title"),
            @Result(property = "content",column = "content"),
            @Result(property = "date_time",column = "date_time"),
            @Result(property = "user",column = "user_id",javaType = User.class,
                    one = @One(select = "com.cupk.mapper.UserMapper.findByID")),
            @Result(property = "plate",column = "plate_id",javaType = Plate.class,
                    one = @One(select = "com.cupk.mapper.PlateMapper.findPlateById")),
    })
    Post findPostById(int id);
    int delPostByIds(long... ids);//批量删帖
    @Update("update t_post set reply_qty = #{count} where id = #{id}")
    Integer CommentUpdate(Integer id,Integer count);
}
