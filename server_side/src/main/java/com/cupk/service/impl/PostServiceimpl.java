package com.cupk.service.impl;

import com.cupk.mapper.PostMapper;
import com.cupk.pojo.Post;
import com.cupk.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 名称MainPostService
 * 描述
 *
 * @version 1.0
 * @author:LANKEREN
 * @datatime:2023-06-26 16:51
 */
@Service
@Primary
public class PostServiceimpl implements PostService {
    @Autowired(required = false)
    PostMapper postMapper;
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
