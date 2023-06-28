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
    public int clickPost(Post post) {
        return postMapper.clickPost(post);
    }

    @Override
    public int upPost(Post post) {
        return postMapper.upPost(post);
    }

    @Override
    public int countReply(Post post) {
        return postMapper.countReply(post);
    }
    @Override
    public List<Post> getMainPostsByPlateID(Integer plate_id) {
        return postMapper.getMainPostsByPlateID(plate_id);
    }

    @Override
    public int insertMainPost(Post post) {
        return postMapper.insertMainPost(post);
    }

    @Override
    public List<Post> findMainPostsByStr(String Str) {
        return postMapper.findMainPostsByStr(Str);
    }
}
