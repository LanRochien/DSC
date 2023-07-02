package com.cupk.service;

import com.cupk.pojo.Plate;
import com.cupk.pojo.Post;

import java.util.List;

public interface PlateService {
    List<Plate> findAllPlate();
    Plate findPlateById(Integer id);
    Integer insertPlate(Plate plate);
    List<Post> findPostsByStr(String Str);//论坛的模糊搜索
    int delPlateById(Integer id);
    Integer postsUpdate(Integer id,Integer post_qty);
    Integer clickUpdate(Integer id,Integer click_qty);

}
