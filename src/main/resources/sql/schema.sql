CREATE TABLE `user` (
  `user_id` varchar(64) NOT NULL COMMENT 'ID',
  `user_name` varchar(32) DEFAULT NULL COMMENT '姓名',
  `user_age` tinyint(4) DEFAULT NULL COMMENT '年龄',
  `user_status` tinyint(4) NOT NULL DEFAULT 1 COMMENT '状态：0 冻结 1 正常',
  `login` tinyint(4) NOT NULL DEFAULT 0 COMMENT '是否登录',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户信息表';