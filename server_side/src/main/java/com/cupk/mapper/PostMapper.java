package com.cupk.mapper;

import com.cupk.pojo.Post;

import java.util.List;

public interface PostMapper {
    int clickPost(Post post);//点击post
    int upPost(Post post);//为post点赞
    int countReply(Post post);//记录回复数
    List<Post> getMainPostsByPlateID(Integer plate_id);//通过版号查询所有主题帖
    int insertMainPost(Post post);//插入主题帖
}
