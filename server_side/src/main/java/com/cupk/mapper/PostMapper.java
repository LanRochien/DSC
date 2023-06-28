package com.cupk.mapper;

import com.cupk.pojo.Post;

import java.util.List;

public interface PostMapper {
    List<Post> getMainPostsByPlateID(Integer plate_id);//通过版号查询所有主题帖
    int insertMainPost(Post post);//插入主题帖
    List<Post> findMainPostsByStr(String Str);//论坛的模糊搜索
}
