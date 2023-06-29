package com.cupk.controller;

import com.cupk.pojo.Activity;
import com.cupk.pojo.Post;
import com.cupk.pojo.User;
import com.cupk.service.ActivityService;
import com.cupk.service.PostService;
import com.cupk.service.UserService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 名称UserController
 * 描述
 *
 * @version 1.0
 * @author:Liu JiaQi
 * @datatime:2023-06-27 18:30
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired(required = false)
    private UserService userService;

    @RequestMapping("/finduserbyid/{id}")
    public String findUserByID(Integer id,Model model){
        System.out.println("001");
        User user=userService.findByID(id);
        if(user!=null){
            System.out.println(user);
            model.addAttribute("msg","成功");
            model.addAttribute("user",user);
        }else{
            model.addAttribute("msg","失败");
        }
        return "test/test";
    }
    @RequestMapping("/findall")
    public String findAllUser(Model model){
        List<User> users = userService.findAllUsers();
        for(User u:users){
            System.out.println(u);
        }
        model.addAttribute("userlist",users);
        return "user/list";
    }
    //注册账号方法
    @PostMapping("/register")
    public String register (User user){
        Gson gson = new Gson();
        int i = userService.register(user);
        if(i>0){
            return gson.toJson(user);
        }
        else{
            return "false";
        }
    }
    //登录账号方法
    @PostMapping("/login")
    public String loginUser(@RequestParam() String name, String password) {
        System.out.println("name=" + name + "pwd" + password);
        if (name.equals("") || password.equals("")) {
            return "用户名或密码不能为空";
        } else {
            if (userService.login(name,password)>0)
                return "登录成功";
            else {
                return "用户名或密码错误";
            }
        }
    }

    //注销账号方法
    @DeleteMapping(value = "/user/{id}")
    public String deleteUserById(@PathVariable int id) {
        if (userService.deleteUserById(id) == 1) {
            return "删除成功!";
        } else {
            return "删除失败!";
        }
    }

    //全站模糊搜索
    @Autowired(required = false)
    PostService postService;
    @Autowired(required = false)
    ActivityService activityService;
    @RequestMapping("findpostactivites")
    public String findPotsAndActivities(String Str,Model model,Integer line1,Integer line2){
        List<Activity> activityList=activityService.findActivitiesByStr(Str);
        List<Post> postList=postService.findMainPostsByStr(Str);
        if(activityList!=null||postList!=null){
            if(activityList!=null){
                if(line1==null||line1==1) {
                    activityList.sort((a, b) -> {
                        Integer a1 = Math.toIntExact(a.getDatetime().getTime());
                        Integer b1 = Math.toIntExact(b.getDatetime().getTime());
                        return b1.compareTo(a1);
                    });
                }else{
                    activityList.sort((a, b) -> {
                        Integer a1 = Math.toIntExact(a.getDatetime().getTime());
                        Integer b1 = Math.toIntExact(b.getDatetime().getTime());
                        return a1.compareTo(b1);
                    });
                }
                for (Activity activity:activityList) {
                    System.out.println(activity);
                }
                model.addAttribute("activities",activityList);
            }
            if(postList!=null){
                if(line2==null||line2==1){
                    postList.sort((a,b)->{
                        Integer a1=a.getClick_qty()*2+a.getUp_qty()*3+a.getReply_qty()*5;
                        Integer b1=b.getClick_qty()*2+a.getReply_qty()*5+a.getUp_qty()*3;
                        return b1.compareTo(a1);
                    });
                }else{
                    postList.sort((a,b)->{
                        Integer a1=a.getClick_qty()*2+a.getUp_qty()*3+a.getReply_qty()*5;
                        Integer b1=b.getClick_qty()*2+a.getReply_qty()*5+a.getUp_qty()*3;
                        return a1.compareTo(b1);
                    });
                }
            }
            model.addAttribute("msg","成功");
        }else{
            model.addAttribute("msg","失败");
        }
        return "test/test";
    }
}
