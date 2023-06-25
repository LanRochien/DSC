package com.cupk.pojo;

import lombok.Data;

import java.util.List;
@Data
public class Activity {
    private Integer id; //活动编号
    private String content; //内容
    private String datetime; //发布时间
    private Integer num_required; //需要人数
    private Integer num_participants;//已报名人数
    private Boolean state;//状态
    List<LoginMessage> LoginMessage;//外键发布者编号
}
