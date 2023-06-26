package com.cupk.service.Impl;

import com.cupk.mapper.PlateMapper;
import com.cupk.pojo.PlateMessage;
import com.cupk.service.PlateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
@Primary
public class PlateServiceImpl implements PlateService {
    @Autowired(required = false)
    private PlateMapper plateMapper;

    @Override
    public List<PlateMessage> findallplate() {
        return plateMapper.findallplate();
    }
}
