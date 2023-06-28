package com.cupk.controller;

import com.cupk.pojo.PlateMessage;
import com.cupk.service.PlateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("plate")
public class PlateController {
    @Autowired(required = false)
    private PlateService plateService;
    @RequestMapping("/findall")
    public String findAllPlate(){
        List<PlateMessage> plateMessageList = plateService.findAllPlate();
        for(PlateMessage pl:plateMessageList){
            System.out.println(pl);
        }
        return "plate/findall";
    }
    @RequestMapping("/findmyall")
    public String findPlate(Model model){
        List<PlateMessage> plateMessageList=plateService.findAllPlate();
        if(plateMessageList!=null){
            model.addAttribute("msg","成功");
        }else{
            model.addAttribute("msg","失败");
        }
        return "test/test";
    }
}
