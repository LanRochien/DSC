package com.cupk.service.impl;

import com.cupk.mapper.PlateMapper;
import com.cupk.pojo.PlateMessage;
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
    public List<PlateMessage> findAllPlate() {
        return plateMapper.findAllPlate();
    }

    @Override
    public PlateMessage findPlateById(Integer id) {
        return plateMapper.findPlateById(id);
    }
}
