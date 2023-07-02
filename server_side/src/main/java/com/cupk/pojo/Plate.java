package com.cupk.pojo;

import lombok.Data;

/**
 * 名称Plate
 * 描述
 *
 * @version 1.0
 * @author:Liu JiaQi
 * @datatime:2023-06-28 20:38
 */
@Data
public class Plate {
    private Integer id;//板块号
    private String name;//板块名
    private String detail;//板块简介
    private Integer click_qty;//点击数
    private Integer post_qty;//主题数
    private String plate_image;//板块图片
}
