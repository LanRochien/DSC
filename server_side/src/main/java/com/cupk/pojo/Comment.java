package com.cupk.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class Comment {
    private Integer id;  //回复编号
    private String content; //回复内容
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date date_time;//回复时间
    private Integer up_qty;//点赞数
    private User user;//外键用户名
    private Post post;//外键主题帖编号
}
