package com.cupk.controller;
import com.cupk.model.Activity_List;
import com.cupk.pojo.Activity;
import com.cupk.pojo.Resp;
import com.cupk.service.ActivityService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/activity")
public class ActivityController {
    @Autowired(required = false)
    private ActivityService activityService;

    @GetMapping ("/findall")
    public String findAllActivities(){
        List<Activity> activities = activityService.findAllActivities();
        Activity_List activityList = new Activity_List();
        Gson gson = new Gson();
        Resp resp = new Resp();
        if(activities!=null) {
            resp.setMsg("查找成功");
            resp.setStatus(200);
            activityList.setActivities(activities);
            activityList.setResp(resp);
        }else {
            resp.setMsg("查找失败");
            resp.setStatus(400);
            activityList.setResp(resp);
        }
        return gson.toJson(activityList);
    }

    @GetMapping("/findActivityByStr")//活动模糊搜索
    public String  findActivityByStr(@RequestParam String Str){
        List<Activity> activities=activityService.findActivityByStr(Str);
        Resp resp = new Resp();
        Gson gson = new Gson();
        Activity_List activityList= new Activity_List();
        if (activities.size()>0){
            resp.setMsg("找到以下内容");
            resp.setStatus(200);
            activityList.setActivities(activities);
            activityList.setResp(resp);
        }else{
            resp.setStatus(400);
            resp.setMsg("未找到相关内容");
            activityList.setActivities(activities);
            activityList.setResp(resp);
        }
        return gson.toJson(activityList);
    }
}
