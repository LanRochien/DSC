package com.cupk.model;

/**
 * 名称statement
 * 描述网站数据统计
 *
 * @version 1.0
 * @author:Liu JiaQi
 * @datatime:2023-07-01 04:52
 */

import lombok.Data;

@Data
public class statement {
    private int count_click;
    private int count_post;
    private int count_comments;
}
