package com.cupk.pojo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class User {
    private Integer id;
    private String password;
    private Boolean role;
    private String name;//用户名
    private String head_url;//头像存储
    private String sex;//用户性别
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;//用户生日
    private Integer post_num;//主题帖数
    private Integer reply_num;//回复数
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date record_date;//注册日期
    private String location;//所在区域
    private Integer vol_tag;//志愿者标志位：
    private Integer ban_tag;//禁用标志位
    private Integer age;//用户年龄
}
