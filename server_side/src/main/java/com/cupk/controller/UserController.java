package com.cupk.controller;

import com.cupk.pojo.User;
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
}
