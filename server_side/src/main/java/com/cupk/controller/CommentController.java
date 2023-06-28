package com.cupk.controller;

import com.cupk.service.CommentService;
import com.cupk.pojo.Comment;
import com.cupk.pojo.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 名称CommentController
 * 描述
 *
 * @version 1.0
 * @author:Liu JiaQi
 * @datatime:2023-06-27 22:43
 */
    @Controller
    @RequestMapping("/comment")
    public class CommentController {
        @Autowired(required = false)
        CommentService commentService;

        @RequestMapping("/findcomments")
        public String findCommentsByPost(Post post, Model model) {
            List<Comment> commentList=commentService.findCommentsByPostID(1);
            if(commentList!=null){
                commentList.sort((a,b)->{
                    Integer a1=a.getClick_qty()*3+a.getUp_qty()*7;
                    Integer b1=b.getClick_qty()*3+b.getUp_qty()*7;
                    return b1.compareTo(a1);
                });
                for (Comment com:commentList) {
                    System.out.println(com);
                }
                model.addAttribute("msg","成功");
                model.addAttribute("comments",commentList);
            }else{
                model.addAttribute("msg","失败");
            }
            return "test/test";
        }
    }

