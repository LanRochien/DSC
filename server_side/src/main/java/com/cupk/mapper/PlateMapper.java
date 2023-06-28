package com.cupk.mapper;

import com.cupk.pojo.PlateMessage;

import java.util.List;

public interface PlateMapper {
    List<PlateMessage> findAllPlate();

    PlateMessage findPlateById(Integer id);
}
