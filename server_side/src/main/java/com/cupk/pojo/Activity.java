package com.cupk.pojo;

import com.cupk.pojo.User;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.google.gson.Gson;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class Activity {
    private Integer id;
    private String title;
    private String content;
    private String activity_image;
    private Date date_time;
    private Integer num_required;
    private Integer num_participants;
    private Integer state; //状态
    private User user; //发布者
}
