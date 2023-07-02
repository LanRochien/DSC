package com.cupk.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class User {
    private Integer id;
    private String password;
    private Integer role;
    private String name;//用户名
    private String head_url;//头像存储
    private String sex;//用户性别
    @JSONField(format = "yyyy-MM-dd")
//    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date birthday;//用户生日
    private Integer post_qty;//主题帖数
    private Integer reply_qty;//回复数
    @JSONField(format = "yyyy-MM-dd")
//    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date record_date;//注册日期
    private String location;//所在区域
    private Integer age;//用户年龄
}
