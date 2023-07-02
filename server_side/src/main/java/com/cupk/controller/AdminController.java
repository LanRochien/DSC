package com.cupk.controller;

import com.cupk.model.User_List;
import com.cupk.model.statement;
import com.cupk.pojo.Activity;
import com.cupk.pojo.Plate;
import com.cupk.pojo.Resp;
import com.cupk.pojo.User;
import com.cupk.service.*;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * 名称LoginController
 * 描述管理员专享类
 *
 * @version 1.0
 * @author:Liu JiaQi
 * @datatime:2023-06-29 12:12
 */
@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired(required = false)
    private UserService userService;
    @Autowired(required = false)
    private ActivityService activityService;
    @Autowired(required = false)
    private PostService postService;
    @Autowired
    private PlateService plateService;
    @Autowired
    private CommentService commentService;

    @GetMapping("/allUsers")
    public String findAllUsers(){
        List<User>userList = userService.findAllUsers();
        Gson gson = new Gson();
        return gson.toJson(userList);
    }

    @PostMapping("/insert")
    public String insertPlate(@RequestBody Plate plate){
        Gson gson = new Gson();
        Resp resp = new Resp();
        if(plateService.insertPlate(plate)!=null){
            resp.setMsg("插入成功");
            resp.setStatus(200);
        }else {
            resp.setMsg("插入失败");
            resp.setStatus(400);
        }
        return gson.toJson(resp);
    }

    @DeleteMapping("/delUserById")
    public String  DelUserByID(@RequestParam int id){
        int del = userService.deleteUserById(id);
        Gson gson = new Gson();
        Resp resp=new Resp();
        if(del>0){
            resp.setStatus(1);
            resp.setMsg("用户删除成功");
        }else {
            resp.setStatus(400);
            resp.setMsg("用户删除失败");
        }
        return gson.toJson(resp);
    }

    @PostMapping("/insertActivity")
    public String insertActivities(@RequestBody Activity activity){
        int i = activityService.insertActivity(activity);
        Resp resp = new Resp();
        Gson gson = new Gson();
        if(i>0) {
            resp.setMsg("插入成功");
            resp.setStatus(200);
        }else {
            resp.setMsg("插入未成功");
            resp.setStatus(400);
        }
        return gson.toJson(resp);
    }

    @DeleteMapping("/delActivityByIds")
    public String delbyids(@RequestParam long... ids) {
        int i = activityService.delActivityByIds(ids);
        Gson gson = new Gson();
        Resp resp = new Resp();
        if(i>0){
            resp.setMsg("删除成功");
            resp.setStatus(200);
        }
        else{
            resp.setMsg("删除未成功");
            resp.setStatus(400);
        }
        return gson.toJson(resp);
    }

    @DeleteMapping("/delPostByIds")
    public String delPostById(@RequestParam long... ids){
        int i = postService.delPostByIds(ids);
        Gson gson = new Gson();
        Resp resp = new Resp();
        if(i>0){
            resp.setStatus(200);
            resp.setMsg("批量删除成功");
        }else {
            resp.setStatus(400);
            resp.setMsg("批量删除失败，请先删除所有回复");
        }
        return gson.toJson(resp);
    }
    @DeleteMapping("/delCommentByIds")
    public String delCommentById(@RequestParam long... ids){
        int i = commentService.delCommentByIds(ids);
        Gson gson = new Gson();
        Resp resp = new Resp();
        if(i>0){
            resp.setStatus(200);
            resp.setMsg("批量删除成功");
        }else {
            resp.setStatus(400);
            resp.setMsg("批量删除失败");
        }
        return gson.toJson(resp);
    }
    @DeleteMapping("/delPlateById")
    public String delPlateById(@RequestParam int id){
        int i=plateService.delPlateById(id);
        Gson gson = new Gson();
        Resp resp = new Resp();
        if(i>0){
            resp.setStatus(200);
            resp.setMsg("板块"+id+"删除成功");
        }else {
            resp.setStatus(400);
            resp.setMsg("板块"+id+"删除失败");
        }
        return gson.toJson(resp);
    }
    @GetMapping("/banUserById")
    public String banUserById(@RequestParam int id,int role){
        Gson gson = new Gson();
        Resp resp = new Resp();
        if(userService.banUserById(id,role)){
            resp.setStatus(200);
            if (role == 2){
            resp.setMsg("角色更改成功");
            }else {
                resp.setMsg("用户禁言成功");
            }
        }else {
            resp.setStatus(400);
            resp.setMsg("操作失败，该用户为管理员用户");
        }
        return gson.toJson(resp);
    }
    @GetMapping("/findall")
    public String findAllUser(){
        List<User> users = userService.findAllUsers();
        Gson gson = new Gson();
        Resp resp = new Resp();
        User_List userList = new User_List();
        if(users!=null){
            resp.setStatus(200);
            resp.setMsg("用户列表查找成功");
            userList.setResp(resp);
            userList.setUsers(users);
        }else {
            resp.setMsg("查找错误");
            resp.setStatus(400);
            userList.setResp(resp);
        }
        return gson.toJson(userList);
    }
    @GetMapping("/count")
    public String getCount(){
        statement state = new statement();
        Gson gson =new Gson();
        state.setCount_click(3200);
        state.setCount_post(120);
        state.setCount_comments(850);
        return gson.toJson(state);
    }
}
