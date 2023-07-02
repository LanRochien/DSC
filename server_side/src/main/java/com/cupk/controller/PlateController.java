package com.cupk.controller;

import com.cupk.model.plate_model;
import com.cupk.pojo.Plate;
import com.cupk.pojo.Post;
import com.cupk.pojo.Resp;
import com.cupk.service.PlateService;
import com.cupk.service.PostService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;




@RestController
@RequestMapping("/plate")
public class PlateController {
    @Autowired(required = false)
    private PlateService plateService;
    @Autowired
    private PostService postService;

    @GetMapping("/findall")
    public String findAllPlate(){
        List<Plate> plates = plateService.findAllPlate();
        Gson gson = new Gson();
        return gson.toJson(plates);
    }

    @GetMapping("/plateDetails")
    public String findPlate(@RequestParam Integer id){
        Plate plateMessage=plateService.findPlateById(id);
        Gson gson = new Gson();
        Resp resp = new Resp();
        List<Post> posts = postService.getMainPostsByPlateID(id);
        plate_model model = new plate_model();
        model.setResp(resp);
        int count_click = 0;
        System.out.println(model);
        if(plateMessage!=null){
            int count_post = posts.size();
            for (Post i:posts) {
                count_click = count_click+i.getClick_qty();
            }
            plateService.postsUpdate(id,count_post);
            plateService.clickUpdate(id,count_click);
            model.setPlate(plateMessage);
            model.setPosts(posts);
            resp.setStatus(200);
            resp.setMsg("查找成功");
            return gson.toJson(model);
        }else {
            resp.setStatus(400);
            resp.setMsg("查找失败");
            return gson.toJson(resp);
        }
    }

}

