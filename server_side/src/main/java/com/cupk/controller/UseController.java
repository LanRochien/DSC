package com.cupk.controller;

import com.cupk.pojo.User;
import com.cupk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
}
