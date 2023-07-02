package com.cupk.service;
import com.cupk.pojo.Activity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
public interface ActivityService {
    List<Activity> findAllActivities();
    int insertActivity(Activity activity);
    int delActivityByIds(long... ids);
    List<Activity> findActivitiesByUserName(String name);
    List<Activity> findActivityByStr(String Str);//活动的模糊搜索
}