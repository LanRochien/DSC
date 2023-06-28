package com.cupk.mapper;
import com.cupk.pojo.Activity;


import java.util.List;

public interface ActivityMapper {
    List<Activity> findAllActivities();
    int insertActivity(Activity activity);
}
