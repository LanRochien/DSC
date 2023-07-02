package com.cupk.model;

import com.cupk.pojo.Plate;
import com.cupk.pojo.Post;
import com.cupk.pojo.Resp;
import lombok.Data;

import java.util.List;

/**
 * 名称plate_model
 * 描述
 *
 * @version 1.0
 * @author:Liu JiaQi
 * @datatime:2023-06-29 23:01
 */
@Data
public class plate_model {
        private Plate plate;
        private List<Post> posts;
        private Resp resp;
}
