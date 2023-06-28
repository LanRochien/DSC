package com.cupk.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Post {
    private Integer id;
    private Integer reply_qty;
    private Integer click_qty;
    private Integer up_qty;
    private String head;
    private String content;
    private Date datetime;
    private PlateMessage plate_id;
    private User user;
}
