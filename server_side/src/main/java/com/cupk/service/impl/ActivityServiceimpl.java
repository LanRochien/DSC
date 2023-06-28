package com.cupk.service.impl;

import com.cupk.mapper.ActivityMapper;
import com.cupk.pojo.Activity;
import com.cupk.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 名称ActivityServiceimpl
 * 描述
 *
 * @version 1.0
 * @author:Liu JiaQi
 * @datatime:2023-06-27 23:03
 *
 */
@Service
@Primary
public class ActivityServiceimpl implements ActivityService {
    @Autowired(required = false)
    ActivityMapper activityMapper;

    @Override
    public List<Activity> findAllActivities() {
        return activityMapper.findAllActivities();
    }

    @Override
    public int insertActivity(Activity activity) {
        return activityMapper.insertActivity(activity);
    }
}
