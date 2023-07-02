package com.cupk.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class Post {
    private Integer id;
    private Integer reply_qty;
    private Integer click_qty;
    private Integer up_qty;
    private String title;
    private String content;
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date date_time;
    private Plate plate;
    private User user;
}
