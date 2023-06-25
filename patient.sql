-- patient.plate_message definition

CREATE TABLE `plate_message` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '板块编号',
  `name` varchar(100) DEFAULT NULL COMMENT '板块名',
  `explain` varchar(300) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL COMMENT '板块简介',
  `click_qty` int DEFAULT NULL COMMENT '板块点击数',
  `post_qty` int DEFAULT NULL COMMENT '主题帖数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;


-- patient.`user` definition

CREATE TABLE `user` (
  `name` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '用户名',
  `sex` varchar(100) DEFAULT NULL COMMENT '用户性别',
  `birthday` varchar(100) DEFAULT NULL COMMENT '用户生日',
  `job` varchar(100) DEFAULT NULL COMMENT '用户职业',
  `post_qty` int NOT NULL COMMENT '主题贴数',
  `reply_qty` int NOT NULL COMMENT '回复数',
  `record_date` date DEFAULT NULL COMMENT '注册日期',
  `location` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL COMMENT '所在区域',
  `vol_tag` tinyint(1) DEFAULT NULL COMMENT '志愿者标志位',
  `age` int NOT NULL COMMENT '用户年龄',
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;


-- patient.login_message definition

CREATE TABLE `login_message` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '用户编号',
  `password` varchar(100) NOT NULL COMMENT '用户密码',
  `role` tinyint(1) NOT NULL COMMENT '用户角色标志位',
  `user_name` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '用户名',
  PRIMARY KEY (`id`),
  KEY `login_message_FK` (`user_name`),
  CONSTRAINT `login_message_FK` FOREIGN KEY (`user_name`) REFERENCES `user` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;


-- patient.main_post definition

CREATE TABLE `main_post` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主题帖编号',
  `reply_qty` int DEFAULT NULL COMMENT '回复数',
  `click_qty` int DEFAULT NULL COMMENT '点击数',
  `up_qty` int DEFAULT NULL COMMENT '点赞数',
  `head` varchar(100) DEFAULT NULL COMMENT '主题帖标题',
  `content` varchar(600) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL COMMENT '主题帖内容',
  `datetime` datetime DEFAULT NULL COMMENT '发帖时间',
  `plate_id` int DEFAULT NULL COMMENT '板块编号',
  `user_id` int DEFAULT NULL COMMENT '发帖人编号',
  PRIMARY KEY (`id`),
  KEY `main_post_FK` (`plate_id`),
  KEY `main_post_FK_1` (`user_id`),
  CONSTRAINT `main_post_FK` FOREIGN KEY (`plate_id`) REFERENCES `plate_message` (`id`),
  CONSTRAINT `main_post_FK_1` FOREIGN KEY (`user_id`) REFERENCES `login_message` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;


-- patient.acticity definition

CREATE TABLE `acticity` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '活动编号',
  `content` varchar(600) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL COMMENT '内容',
  `datetime` datetime DEFAULT NULL COMMENT '发布时间',
  `num_requied` int DEFAULT NULL COMMENT '需要人数',
  `num_participants` int DEFAULT NULL COMMENT '已报名人数',
  `state` tinyint(1) DEFAULT NULL COMMENT '活动状态',
  `user_id` int DEFAULT NULL COMMENT '发布者编号',
  PRIMARY KEY (`id`),
  KEY `acticity_FK` (`user_id`),
  CONSTRAINT `acticity_FK` FOREIGN KEY (`user_id`) REFERENCES `login_message` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;


-- patient.comment definition

CREATE TABLE `comment` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '评论编号',
  `content` varchar(400) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL COMMENT '评论内容',
  `datetime` datetime DEFAULT NULL COMMENT '评论时间',
  `click_qty` int DEFAULT NULL COMMENT '点击数',
  `up_qty` int DEFAULT NULL COMMENT '点赞数',
  `mainpost_id` int DEFAULT NULL COMMENT '主题帖编号',
  `user_id` int DEFAULT NULL COMMENT '发表者编号',
  PRIMARY KEY (`id`),
  KEY `comment_FK` (`user_id`),
  KEY `comment_FK_1` (`mainpost_id`),
  CONSTRAINT `comment_FK` FOREIGN KEY (`user_id`) REFERENCES `login_message` (`id`),
  CONSTRAINT `comment_FK_1` FOREIGN KEY (`mainpost_id`) REFERENCES `main_post` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;