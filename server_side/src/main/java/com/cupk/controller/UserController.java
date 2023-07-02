package com.cupk.controller;

import com.cupk.model.Profile;
import com.cupk.model.user_model;
import com.cupk.pojo.*;
import com.cupk.service.ActivityService;
import com.cupk.service.CommentService;
import com.cupk.service.PostService;
import com.cupk.service.UserService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private UserService userService;
    @Autowired
    private PostService postService;
    @Autowired
    private ActivityService activityService;
    @Autowired
    private CommentService commentService;

    @GetMapping("/findDetail")
    public String findDetailByName(@RequestParam String name){
        User user = userService.getUserByName(name);
        Profile profile = new Profile();
        Gson gson = new Gson();
        Resp resp = new Resp();
        if (user!=null){
            resp.setStatus(200);
            resp.setMsg("查询成功");
            List<Post> posts = postService.getMainPostsByUserName(name);
            int post_qty = posts.size();
            List<Comment> comments = commentService.findCommentsByUserName(name);
            int reply_qty = comments.size();
            userService.updatePostCount(name,post_qty);
            userService.updateReplyCount(name,reply_qty);
            profile.setComments(comments);
            profile.setUser(user);
            profile.setPosts(posts);
            profile.setResp(resp);
        }else {
            resp.setMsg("未请求到数据（用户不存在或账号已注销）");
            resp.setStatus(400);
            profile.setResp(resp);
        }
        return gson.toJson(profile);
    }

    //注册账号方法
    @PostMapping("/register")
    public String register (@RequestBody User user){
        Gson gson = new Gson();
        Resp resp = new Resp();
        int i = userService.register(user);
        if(i>0){
            resp.setMsg("注册成功");
            resp.setStatus(200);
        }
        else{
            resp.setMsg("注册失败，请联系管理员");
            resp.setStatus(400);
        }
        return gson.toJson(resp);
    }
    //登录账号方法
    @PostMapping("/login")
    public String loginUser(@RequestParam("username") String username,
                            @RequestParam("password") String password) {
        System.out.println("name=" + username + "pwd" + password);
        Gson gson = new Gson();
        Resp resp = new Resp();
        if (username.equals("") || password.equals("")) {
            resp.setMsg("用户名或密码不能为空");
            resp.setStatus(401);
            return gson.toJson(resp);
        } else {
            if (userService.login(username,password)!=null){
                user_model model = new user_model();
                resp.setMsg("登录成功");
                resp.setStatus(200);
                model.setResp(resp);
                model.setUser(userService.login(username,password));
                System.out.println(model);
                return gson.toJson(model);
            }
            else {
                resp.setMsg("用户名或密码错误");
                resp.setStatus(402);
                return gson.toJson(resp);
            }
        }
    }
    //注销账号方法
    @DeleteMapping(value = "/deluser")
    public String deleteUserById(@RequestParam int id) {
        Gson gson = new Gson();
        if (userService.deleteUserById(id) == 1) {
            Resp resp = new Resp();
            resp.setMsg("账号注销成功");
            resp.setStatus(200);
            return gson.toJson(resp);
        } else {
            Resp resp = new Resp();
            resp.setMsg("账号注销失败");
            resp.setStatus(400);
            return gson.toJson(resp);
        }
    }

}
