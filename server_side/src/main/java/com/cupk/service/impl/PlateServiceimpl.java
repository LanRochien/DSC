package com.cupk.service.impl;

import com.cupk.mapper.PlateMapper;
import com.cupk.pojo.Plate;
import com.cupk.pojo.Post;
import com.cupk.service.PlateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 名称PlateService
 * 描述
 *
 * @version 1.0
 * @author:Liu JiaQi
 * @datatime:2023-06-26 11:39
 */
@Service
@Primary
public class PlateServiceimpl implements PlateService {
    @Autowired(required = false)
    private PlateMapper plateMapper;

    @Override
    public List<Plate> findAllPlate() {
        return plateMapper.findAllPlate();
    }

    @Override
    public Plate findPlateById(Integer id) {
        return plateMapper.findPlateById(id);
    }

    @Override
    public Integer insertPlate(Plate plate) {
        return plateMapper.insertPlate(plate);
    }

    @Override
    public List<Post> findPostsByStr(String Str) {
        return plateMapper.findPostsByStr(Str);
    }

    @Override
    public int delPlateById(Integer id) {
        return plateMapper.delPlateById(id);
    }

    @Override
    public Integer postsUpdate(Integer id, Integer post_qty) {
        return plateMapper.postsUpdate(id,post_qty);
    }

    @Override
    public Integer clickUpdate(Integer id, Integer click_qty) {
        return plateMapper.clickUpdate(id,click_qty);
    }
}
