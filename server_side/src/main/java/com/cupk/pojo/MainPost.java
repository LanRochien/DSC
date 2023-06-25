package com.cupk.pojo;

import lombok.Data;

import java.util.List;
@Data
public class MainPost {
    private Integer id;//主题贴编号
    private Integer reply_qty;//回复数
    private Integer click_qty;//点击数
    private Integer up_qty;//点赞数
    private String head;//标题
    private String content;//内容
    private String datetime;//发布时间
    List<LoginMessage> LoginMessageList;//外键发帖人编号
    List<PlateMessage> PlantMessageList;//外键板块号
}
