package com.cupk.controller;

import com.cupk.model.Post_List;
import com.cupk.model.post_model;
import com.cupk.pojo.Comment;
import com.cupk.pojo.Post;
import com.cupk.pojo.Resp;
import com.cupk.service.CommentService;
import com.cupk.service.PostService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * 名称PostController
 * 描述
 *
 * @version 1.0
 * @author:Liu JiaQi
 * @datatime:2023-06-27 19:04
 */
@CrossOrigin (origins = "http://localhost:8129")
@RestController
@RequestMapping("/post")
public class PostController {
    @Autowired(required = false)
    private PostService postService;
    @Autowired(required = false)
    private CommentService commentService;

    @RequestMapping("/up")
    public String upPost(Integer id) {
        int i = postService.upPost(id);
        Gson gson = new Gson();
        Resp resp = new Resp();
        if (i>0){
            resp.setStatus(200);
            resp.setMsg("点赞成功");
        }else {
            resp.setStatus(400);
            resp.setMsg("点赞失败");
        }
        return gson.toJson(resp);
    }//为post点赞

    @PostMapping("/insertPost")//发表新帖子
    public String insertMainPost(@RequestBody Post post){
        int i= postService.insertMainPost(post);
        Resp resp = new Resp();
        Gson gson = new Gson();
        if (i>0){
            resp.setMsg("发布成功");
            resp.setStatus(200);
            postService.countReply(post.getPlate().getId());//贴子数更新
        }else {
            resp.setMsg("发布失败");
            resp.setStatus(400);
        }
        return gson.toJson(resp);
    }

    @GetMapping("/postDetail")
    public String findAllPosts(@RequestParam int id){
        Post post = postService.findPostById(id);
        List<Comment> comments = commentService.findCommentsByPostID(id);
        post_model model = new post_model();
        Gson gson = new Gson();
        Resp resp = new Resp();
        if(post!=null){
            postService.clickPost(id);
            model.setPost(post);
            if(comments.size()>0){
                model.setComments(comments);
            }
            postService.CommentUpdate(id,comments.size());
            post.getUp_qty();
            resp.setMsg("查找成功");
            resp.setStatus(200);
        }else {
            resp.setMsg("操作失败");
            resp.setStatus(400);
        }
        model.setResp(resp);
        return gson.toJson(model);
    }

    @GetMapping("/findPostByStr")//主题帖模糊搜索
    public String  findPostsByStr(@RequestParam String Str){
        List<Post> posts=postService.findPostsByStr(Str);
        Resp resp = new Resp();
        Gson gson = new Gson();
        Post_List postList = new Post_List();
        if (posts.size()>0){
            postList.setPosts(posts);
            resp.setStatus(200);
            resp.setMsg("搜索成功");
            postList.setResp(resp);
            postList.setPosts(posts);
            return gson.toJson(postList);
        }else{
            resp.setStatus(400);
            resp.setMsg("搜索失败");
            return gson.toJson(resp);
        }
    }
    @GetMapping("/findall")
    public String findall(){
        List<Post> posts=postService.getAllPosts();
        Resp resp = new Resp();
        Gson gson = new Gson();
        Post_List postList = new Post_List();
        if (posts.size()>0){
            postList.setPosts(posts);
            resp.setStatus(200);
            resp.setMsg("操作成功");
            postList.setResp(resp);
            postList.setPosts(posts);
            return gson.toJson(postList);
        }else{
            resp.setStatus(400);
            resp.setMsg("无结果");
            return gson.toJson(resp);
        }
    }

}

