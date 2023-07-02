package com.cupk.controller;

import com.cupk.pojo.Resp;
import com.cupk.service.CommentService;
import com.cupk.pojo.Comment;
import com.cupk.pojo.Post;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 名称CommentController
 * 描述
 *
 * @version 1.0
 * @author:Liu JiaQi
 * @datatime:2023-06-27 22:43
 */
@CrossOrigin(origins = "http://localhost:8129")
    @RestController
    @RequestMapping("/comment")
    public class CommentController {
        @Autowired(required = false)
        CommentService commentService;

        @PostMapping("/insertcomment")
        public String insertComment(@RequestBody Comment comment)
        {
            Gson gson = new Gson();
            Resp resp = new Resp();
            if(commentService.insertComment(comment)!=null){
                resp.setStatus(200);
                resp.setMsg("插入成功");
            }else {
                resp.setStatus(400);
                resp.setMsg("插入失败");
            }
            return gson.toJson(resp);
        }
    }

