-- patient.plate_message definition

CREATE TABLE `t_plate` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '板块编号',
  `name` VARCHAR(100) DEFAULT NULL COMMENT '板块名',
  `explain` VARCHAR(300) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL COMMENT '板块简介',
  `click_qty` INT DEFAULT NULL COMMENT '板块点击数',
  `post_qty` INT DEFAULT NULL COMMENT '主题帖数',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8mb3;


-- patient.`user` definition

CREATE TABLE `t_user` (
  `name` VARCHAR(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '用户名',
  `sex` VARCHAR(100) DEFAULT NULL COMMENT '用户性别',
  `birthday` VARCHAR(100) DEFAULT NULL COMMENT '用户生日',
  `job` VARCHAR(100) DEFAULT NULL COMMENT '用户职业',
  `post_qty` INT NOT NULL COMMENT '主题贴数',
  `reply_qty` INT NOT NULL COMMENT '回复数',
  `record_date` DATE DEFAULT NULL COMMENT '注册日期',
  `location` VARCHAR(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL COMMENT '所在区域',
  `vol_tag` TINYINT(1) DEFAULT NULL COMMENT '志愿者标志位',
  `age` INT NOT NULL COMMENT '用户年龄',
  PRIMARY KEY (`name`)
) ENGINE=INNODB DEFAULT CHARSET=utf8mb3;


-- patient.login_message definition

CREATE TABLE `t_login` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '用户编号',
  `password` VARCHAR(100) NOT NULL COMMENT '用户密码',
  `role` TINYINT(1) NOT NULL COMMENT '用户角色标志位',
  `user_name` VARCHAR(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '用户名',
  PRIMARY KEY (`id`),
  KEY `login_message_FK` (`user_name`),
  CONSTRAINT `login_message_FK` FOREIGN KEY (`user_name`) REFERENCES `t_user` (`name`)
) ENGINE=INNODB DEFAULT CHARSET=utf8mb3;


-- patient.main_post definition

CREATE TABLE `t_post` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '主题帖编号',
  `reply_qty` INT DEFAULT NULL COMMENT '回复数',
  `click_qty` INT DEFAULT NULL COMMENT '点击数',
  `up_qty` INT DEFAULT NULL COMMENT '点赞数',
  `head` VARCHAR(100) DEFAULT NULL COMMENT '主题帖标题',
  `content` VARCHAR(600) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL COMMENT '主题帖内容',
  `datetime` DATETIME DEFAULT NULL COMMENT '发帖时间',
  `plate_id` INT DEFAULT NULL COMMENT '板块编号',
  `user_id` INT DEFAULT NULL COMMENT '发帖人编号',
  PRIMARY KEY (`id`),
  KEY `main_post_FK` (`plate_id`),
  KEY `main_post_FK_1` (`user_id`),
  CONSTRAINT `main_post_FK` FOREIGN KEY (`plate_id`) REFERENCES `t_plate` (`id`),
  CONSTRAINT `main_post_FK_1` FOREIGN KEY (`user_id`) REFERENCES `t_login` (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8mb3;


-- patient.acticity definition

CREATE TABLE `t_acticity` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '活动编号',
  `content` VARCHAR(600) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL COMMENT '内容',
  `datetime` DATETIME DEFAULT NULL COMMENT '发布时间',
  `num_requied` INT DEFAULT NULL COMMENT '需要人数',
  `num_participants` INT DEFAULT NULL COMMENT '已报名人数',
  `state` TINYINT(1) DEFAULT NULL COMMENT '活动状态',
  `user_id` INT DEFAULT NULL COMMENT '发布者编号',
  PRIMARY KEY (`id`),
  KEY `acticity_FK` (`user_id`),
  CONSTRAINT `acticity_FK` FOREIGN KEY (`user_id`) REFERENCES `t_login` (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8mb3;


-- patient.comment definition

CREATE TABLE `t_comment` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '评论编号',
  `content` VARCHAR(400) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL COMMENT '评论内容',
  `datetime` DATETIME DEFAULT NULL COMMENT '评论时间',
  `click_qty` INT DEFAULT NULL COMMENT '点击数',
  `up_qty` INT DEFAULT NULL COMMENT '点赞数',
  `mainpost_id` INT DEFAULT NULL COMMENT '主题帖编号',
  `user_id` INT DEFAULT NULL COMMENT '发表者编号',
  PRIMARY KEY (`id`),
  KEY `comment_FK` (`user_id`),
  KEY `comment_FK_1` (`mainpost_id`),
  CONSTRAINT `comment_FK` FOREIGN KEY (`user_id`) REFERENCES `t_login` (`id`),
  CONSTRAINT `comment_FK_1` FOREIGN KEY (`mainpost_id`) REFERENCES `t_post` (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8mb3;