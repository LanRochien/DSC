package com.cupk.pojo;

import lombok.Data;

@Data
public class PlateMessage {
    private Integer id;//板块号
    private String name;//板块名
    private String explain;//板块简介
    private Integer click_qty;//点击数
    private Integer post_qty;//主题数
}
