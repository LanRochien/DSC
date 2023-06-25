package com.cupk.pojo;

import lombok.Data;

import java.util.List;
@Data
public class Comment {
    private Integer id;  //回复编号
    private String content; //回复内容
    private String datetime;//回复时间
    private Integer click_qty;//点击数
    private Integer up_qty;//点赞数
    List<LoginMessage> LoginMessageList;//外键用户编号
    List<MainPost> MainPostList;//外键主题帖编号
}
