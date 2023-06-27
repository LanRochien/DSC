package com.cupk.controller;

import com.cupk.pojo.User;
import com.cupk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 名称UseController
 * 描述
 *
 * @version 1.0
 * @author:Liu JiaQi
 * @datatime:2023-06-25 20:55
 */
@Controller
@RequestMapping("/test")
public class UseController {
    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public List<User> findAll(){
        return userService.findAllUsers();
    }

    @RequestMapping("/findbid")
    public String findUserByName(Integer id, Model model){
        User user=userService.findByID(id);
        if(user!=null){
            System.out.println(user);
            model.addAttribute("user",user);
            model.addAttribute("msg","成功");
        }else{
            model.addAttribute("msg","失败");
        }
        return "test/test";
    }
}
