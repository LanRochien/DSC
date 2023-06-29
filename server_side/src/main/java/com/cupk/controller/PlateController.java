package com.cupk.controller;

import com.cupk.pojo.PlateMessage;
import com.cupk.service.PlateService;
import com.google.gson.Gson;
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

    @RequestMapping("/findmyall/{id}")
    public String findPlate(Integer id){
        PlateMessage plateMessage=plateService.findPlateById(id);
        if(plateMessage!=null) {
            Gson gson = new Gson();
            return gson.toJson(plateMessage);
        }else {
            return "false";
        }
    }
}
