package com.cupk.service.impl;

import com.cupk.mapper.PostMapper;
import com.cupk.pojo.Post;
import com.cupk.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 名称PostServiceimpl
 * 描述
 *
 * @version 1.0
 * @author:Liu JiaQi
 * @datatime:2023-06-27 18:47
 */
@Service
@Primary
public class PostServiceimpl implements PostService {
    @Autowired(required = false)
    private PostMapper postMapper;
    @Override
    public int clickPost(int id) {
        return postMapper.clickPost(id);
    }

    @Override
    public int upPost(int id) {
        return postMapper.upPost(id);
    }

    @Override
    public int countReply(int id) {
        return postMapper.countReply(id);
    }
    @Override
    public List<Post> getMainPostsByPlateID(Integer plate_id) {
        return postMapper.getMainPostsByPlateID(plate_id);
    }

    @Override
    public List<Post> getMainPostsByUserName(String name) {
        return postMapper.getMainPostsByUserName(name);
    }

    @Override
    public int insertMainPost(Post post) {
        return postMapper.insertMainPost(post);
    }

    @Override
    public List<Post> findPostsByStr(String Str) {
        return postMapper.findPostsByStr(Str);
    }

    @Override
    public int delPostByIds(long... ids) {
        return postMapper.delPostByIds(ids);
    }

    @Override
    public Post findPostById(int id) {
        return postMapper.findPostById(id);
    }

    @Override
    public Integer CommentUpdate(Integer id, Integer count) {
        return postMapper.CommentUpdate(id,count);
    }

    @Override
    public List<Post> getAllPosts() {
        return postMapper.getAllPosts();
    }

}
