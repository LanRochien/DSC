package com.cupk.controller;
import com.cupk.pojo.Activity;
import com.cupk.service.ActivityService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/activity")
public class ActivityController {
    @Autowired(required = false)
    private ActivityService activityService;

    @GetMapping ("/findall")
    public String findAllActivities(Model model){
        List<Activity> activities = activityService.findAllActivities();
        model.addAttribute("activityList",activities);
        if(activities!=null) {
            Gson gson = new Gson();
            return gson.toJson(activities);
        }else {
            return "false";
        }
    }

    @RequestMapping("/toinsert")
    public String toinsert(){
        return "activity/insert";
    }
    @RequestMapping("/insertactivity")
    public String insertActivities(Activity activity,Model model){
        int i = activityService.insertActivity(activity);
        List<Activity> activities = activityService.findAllActivities();
        for(Activity activity1 :activities){
            System.out.println(activity);
        }
        model.addAttribute("activityList",activities);
        return "activity/findall";
    }


}
