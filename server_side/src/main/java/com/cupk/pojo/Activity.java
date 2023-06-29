package com.cupk.pojo;


import lombok.Data;

import java.util.Date;

@Data
public class Activity {
    private Integer id;
    private String content;
    private Date datetime;
    private Integer num_required;
    private Integer num_participants;
    private String state;
    private User user;
}
