package com.cupk.controller;

import com.cupk.pojo.Post;
import com.cupk.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 名称PostController
 * 描述
 *
 * @version 1.0
 * @author:Liu JiaQi
 * @datatime:2023-06-27 19:04
 */
@RestController
@RequestMapping("/post")
public class PostController {
    @Autowired(required = false)
    private PostService postService;

    @RequestMapping("/click")
    public int clickPost(Post post) {
        postService.clickPost(post);
        return post.getClick_qty();
    }//点击post

    @RequestMapping("/up")
    public int upPost(Post post) {
        postService.upPost(post);
        return post.getUp_qty();
    }//为post点赞

    @RequestMapping("/reply")
    public int countReply(Post post) {
        postService.countReply(post);
        return post.getReply_qty();
    }//记录回复数
    @GetMapping("/getpostbyid")
    public String getMainPostsByPlateID(Integer plate_id, Model model){
        List<Post> posts = postService.getMainPostsByPlateID(plate_id);
        posts.sort((Post a, Post b)->{
            Integer a1=a.getClick_qty()*2+a.getUp_qty()*3+a.getReply_qty()*5;
            Integer b1=b.getClick_qty()*2+a.getReply_qty()*5+a.getUp_qty()*3;
            return b1.compareTo(a1);
        });
        if(posts !=null){
            for (Post i: posts) {
                System.out.println(i);
            }
            System.out.println("0101\n");
            model.addAttribute("mainpostlist", posts);
            model.addAttribute("msg","成功");
        }else{
            model.addAttribute("msg","失败");
        }
        return "test/test";
    }

    @RequestMapping("/insertpost")
    public String insertMainPost(Post post, Model model){
        int i= postService.insertMainPost(post);
        if(i>0){
            model.addAttribute("msg","成功");
        }else{
            model.addAttribute("msg","失败");
        }
        return "test/test";
    }
}
