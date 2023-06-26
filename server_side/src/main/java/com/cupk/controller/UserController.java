package com.cupk.controller;

import com.cupk.pojo.User;
import com.cupk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired(required = false)
    private UserService userService;
    @RequestMapping("/findall")
    public String findall(Model model){
        List<User> users = userService.findall();
        for(User u:users){
            System.out.println(u);
        }
        model.addAttribute("userlist",users);
        return "user/list";
    }
}
