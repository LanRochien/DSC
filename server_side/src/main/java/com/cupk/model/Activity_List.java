package com.cupk.model;

import com.cupk.pojo.Activity;
import com.cupk.pojo.Resp;
import lombok.Data;

import java.util.List;

/**
 * 名称Activity_List
 * 描述 搜索活动数据模型
 *
 * @version 1.0
 * @author:Liu JiaQi
 * @datatime:2023-06-30 16:51
 */
@Data
public class Activity_List {
    private List<Activity> activities;
    private Resp resp;
}
