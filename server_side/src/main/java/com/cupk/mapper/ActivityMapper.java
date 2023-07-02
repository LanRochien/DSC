package com.cupk.mapper;
import com.cupk.pojo.Activity;
import com.cupk.pojo.Plate;
import com.cupk.pojo.User;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.context.annotation.RequestScope;


import java.util.List;


public interface ActivityMapper {
    @Select("select * from t_activity")
    @Results({
            @Result(property = "id",column = "id"),
            @Result(property = "title",column = "title"),
            @Result(property = "content",column = "content"),
            @Result(property = "date_time",column = "date_time"),
            @Result(property = "status",column = "status"),
            @Result(property = "num_required",column = "num_required"),
            @Result(property = "num_participants",column = "num_participants"),
            @Result(property = "activity_image",column = "activity_image"),
            @Result(property = "user",column = "user_id",javaType = User.class,
                    one = @One(select = "com.cupk.mapper.UserMapper.findByID")),
    })
    List<Activity> findAllActivities();
    int insertActivity(Activity activity);
    int delActivityByIds(long... ids);
    @Select("select * from t_activity where user_id=(select id from t_user where name = #{name})")
    @Results({
            @Result(property = "id",column = "id"),
            @Result(property = "title",column = "title"),
            @Result(property = "content",column = "content"),
            @Result(property = "date_time",column = "date_time"),
            @Result(property = "status",column = "status"),
            @Result(property = "num_required",column = "num_required"),
            @Result(property = "num_participants",column = "num_participants"),
            @Result(property = "activity_image",column = "activity_image"),
            @Result(property = "user",column = "user_id",javaType = User.class,
                    one = @One(select = "com.cupk.mapper.UserMapper.findByID")),
    })
    List<Activity> findActivitiesByUserName(String name);
    @Select("select * from t_activity where title like CONCAT('%',#{Str},'%')")
    @Results({
            @Result(property = "id",column = "id"),
            @Result(property = "title",column = "title"),
            @Result(property = "content",column = "content"),
            @Result(property = "date_time",column = "date_time"),
            @Result(property = "status",column = "status"),
            @Result(property = "num_required",column = "num_required"),
            @Result(property = "num_participants",column = "num_participants"),
            @Result(property = "activity_image",column = "activity_image"),
            @Result(property = "user",column = "user_id",javaType = User.class,
                    one = @One(select = "com.cupk.mapper.UserMapper.findByID")),
    })
    List<Activity> findActivityByStr(String Str);//活动的模糊搜索
}
