package com.cupk.service;

import com.cupk.pojo.Post;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PostService {
    int clickPost(int id);//点击post
    int upPost(int id);//为post点赞
    int countReply(int id);//记录回复数
    List<Post>getMainPostsByPlateID(Integer plate_id);//通过版号查询所有主题帖
    List<Post>getMainPostsByUserName(String name);//通过用户名查询所有主题帖
    int insertMainPost(Post post);//插入主题帖
    List<Post> findPostsByStr(String Str);//论坛的模糊搜索
    int delPostByIds(long... ids);//批量删帖
    Post findPostById(int id);
    Integer CommentUpdate(Integer id,Integer count);
    List<Post> getAllPosts();//通过版号查询所有主题帖
}
