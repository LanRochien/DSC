package com.cupk.controller;

import com.cupk.pojo.PlateMessage;
import com.cupk.service.PlateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("plate")
public class PlateController {
    @Autowired(required = false)
    private PlateService plateService;
    @RequestMapping("/findall")
    public String findallplate(){
        List<PlateMessage> plateMessage = plateService.findallplate();
        for(PlateMessage pl:plateMessage){
            System.out.println(pl);
        }
        return "plate/findall";

    }
}
