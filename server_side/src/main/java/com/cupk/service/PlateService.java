package com.cupk.service;

import com.cupk.pojo.PlateMessage;

import java.util.List;

public interface PlateService {
    List<PlateMessage> findAllPlate();
    PlateMessage findPlateById(Integer id);
}
