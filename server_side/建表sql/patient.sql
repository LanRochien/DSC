-- patient.t_plate definition

CREATE TABLE `t_plate` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `explain` varchar(300) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  `click_qty` int DEFAULT NULL,
  `post_qty` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3;


-- patient.t_user definition

CREATE TABLE `t_user` (
  `name` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `sex` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `birthday` date NOT NULL,
  `job` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `post_qty` int DEFAULT NULL,
  `record_date` date NOT NULL,
  `location` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `vol_tag` tinyint(1) DEFAULT NULL,
  `age` int DEFAULT NULL,
  `reply_qty` int DEFAULT NULL,
  `id` int NOT NULL AUTO_INCREMENT,
  `password` varchar(100) NOT NULL,
  `role` tinyint(1) DEFAULT NULL,
  `head_url` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `t_user_un` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3;


-- patient.t_activity definition

CREATE TABLE `t_activity` (
  `id` int NOT NULL AUTO_INCREMENT,
  `content` varchar(600) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  `datetime` datetime DEFAULT NULL,
  `num_required` int DEFAULT NULL,
  `num_participants` int DEFAULT NULL,
  `state` varchar(100) DEFAULT NULL,
  `user_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `t_activity_FK` (`user_id`),
  CONSTRAINT `t_activity_FK` FOREIGN KEY (`user_id`) REFERENCES `t_user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb3;


-- patient.t_post definition

CREATE TABLE `t_post` (
  `id` int NOT NULL AUTO_INCREMENT,
  `reply_qty` int DEFAULT NULL,
  `click_qty` int DEFAULT NULL,
  `up_qty` int DEFAULT NULL,
  `head` varchar(100) DEFAULT NULL,
  `content` varchar(600) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  `datetime` datetime DEFAULT NULL,
  `plate_id` int DEFAULT NULL,
  `user_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `main_post_FK` (`plate_id`),
  KEY `t_post_FK` (`user_id`),
  CONSTRAINT `main_post_FK` FOREIGN KEY (`plate_id`) REFERENCES `t_plate` (`id`),
  CONSTRAINT `t_post_FK` FOREIGN KEY (`user_id`) REFERENCES `t_user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3;


-- patient.t_comment definition

CREATE TABLE `t_comment` (
  `id` int NOT NULL AUTO_INCREMENT,
  `content` varchar(400) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  `datetime` datetime DEFAULT NULL,
  `click_qty` int DEFAULT NULL,
  `up_qty` int DEFAULT NULL,
  `mainpost_id` int DEFAULT NULL,
  `user_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `comment_FK_1` (`mainpost_id`),
  KEY `t_comment_FK` (`user_id`),
  CONSTRAINT `comment_FK_1` FOREIGN KEY (`mainpost_id`) REFERENCES `t_post` (`id`),
  CONSTRAINT `t_comment_FK` FOREIGN KEY (`user_id`) REFERENCES `t_user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;