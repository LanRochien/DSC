package com.cupk.pojo;

import com.cupk.pojo.User;
import lombok.Data;

@Data
public class Activity {
    private Integer id;
    private String content;
    private String datetime;
    private Integer num_required;
    private Integer num_participants;
    private String state;
    private User user;
}
