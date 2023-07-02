package com.cupk.mapper;

import com.cupk.pojo.Plate;
import com.cupk.pojo.Post;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface PlateMapper {
    List<Plate> findAllPlate();
    Plate findPlateById(Integer id);
    Integer insertPlate(Plate plate);
    List<Post> findPostsByStr(String Str);//论坛的模糊搜索
    int delPlateById(Integer id);
    @Update("update t_plate set post_qty = #{post_qty} where id = #{id}")
    Integer postsUpdate(Integer id,Integer post_qty);
    @Update("update t_plate set click_qty = #{click_qty} where id = #{id}")
    Integer clickUpdate(Integer id,Integer click_qty);
}
