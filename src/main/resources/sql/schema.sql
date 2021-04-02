CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `user_name` varchar(32) DEFAULT NULL COMMENT '姓名',
  `user_age` tinyint(4) DEFAULT NULL COMMENT '年龄',
  `user_status` tinyint(4) NOT NULL DEFAULT 1 COMMENT '状态：0 冻结 1 正常',
  `ctime` int(11) DEFAULT NULL COMMENT '创建时间',
  `utime` int(11) DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户信息表';