package com.cupk.mapper;
import com.cupk.pojo.Activity;


import java.util.List;

public interface ActivityMapper {
    List<Activity> findAllActivities();
    int insertActivity(Activity activity);
    List<Activity> findActivitiesByStr(String Str);//活动的模糊搜索

}
