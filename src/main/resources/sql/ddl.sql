CREATE TABLE `activity` (
	`id` BIGINT(20) NOT NULL COMMENT '活动id',
	`title` VARCHAR(64) NOT NULL COMMENT '活动标题',
	`organizer` VARCHAR(64) NOT NULL COMMENT '主办方',
	`apply_time` int(11) not null COMMENT '报名申请开始时间',
	`vote_time` int(11) not null comment '投票开始时间',
	`end_time` int(11) not null COMMENT '结束时间',
	`activity_status` SMALLINT(6) not null COMMENT '活动状态：0.未上架 1.已上架',
	`tags` VARCHAR(256) NOT NULL COMMENT '活动标签，多个用逗号分隔',
	`introduction` VARCHAR(1024) NOT NULL COMMENT '活动简介',
	`ranking` SMALLINT(6) not null COMMENT '获胜名次',
	`share_icon` VARCHAR(256) NOT NULL COMMENT '分享icon',
	`block_icon` VARCHAR(256) NOT NULL COMMENT '列表小方块图',
	`horizontal_icon` VARCHAR(256) NOT NULL COMMENT '横屏大图',
	`vertical_icon` VARCHAR(256) NOT NULL COMMENT '竖屏大图',
	`has_deleted` SMALLINT(6) NOT NULL COMMENT '是否删除 0.否 1.是',
	`ctime` int(11) NOT NULL COMMENT '创建时间',
    `utime` int(11) NOT NULL COMMENT '更新时间',
	PRIMARY KEY (`id`),
	KEY `idx_ctime` (`ctime`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='路演活动表';

CREATE TABLE `activity_tag` (
	`id` BIGINT(20) NOT NULL COMMENT '活动id',
	`name` varchar(32) NOT NULL COMMENT '标签名称',
	`has_deleted` SMALLINT(6) NOT NULL COMMENT '是否删除 0.否 1.是',
	`ctime` int(11) NOT NULL COMMENT '创建时间',
    `utime` int(11) NOT NULL COMMENT '更新时间',
	PRIMARY KEY (`id`),
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='活动标签表';

CREATE table `activity_works` (
	`id` BIGINT(20) NOT NULL COMMENT '项目id',
	`uid` int(11) not null COMMENT '活动参与人',
	`audit_status` SMALLINT(6) not null COMMENT '审核状态 1.待审核 2.审核通过 3.审核不通过',
	`icon` VARCHAR(256) NOT NULL COMMENT '项目logo',
	`name` VARCHAR(64) not null COMMENT '项目名称',
	`stage` SMALLINT(6) not null COMMENT '项目阶段 1.idea阶段 2.产品研发中 3.已运营 4.已关闭',
	`area` varchar(64) not null COMMENT '项目区域',
	`industry` VARCHAR(64) not null COMMENT '所属行业',
	`introduction` VARCHAR(1024) NOT NULL COMMENT '项目简介',
	`video_url` VARCHAR(256) not null COMMENT '视频路径',
	`ctime` int(11) NOT NULL COMMENT '创建时间',
    `utime` int(11) NOT NULL COMMENT '更新时间',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='活动参赛作品表';

create table `activity_works_audit` (
	`id` BIGINT(20) NOT NULL COMMENT '审核id',
	`works_id` BIGINT(20) not null COMMENT '参赛作品id',
	`uid` int(11) not null COMMENT '作品投稿人',
	`pass_status` SMALLINT(6) not null COMMENT '是否通过 0.审核不通过 1.审核通过',
	`reason` VARCHAR(256) COMMENT '审核原因',
	`operator` int(11) not null COMMENT '操作人id',
	`ctime` int(11) NOT NULL COMMENT '创建时间',
    `utime` int(11) NOT NULL COMMENT '更新时间',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='活动参赛作品审核记录表';

create table `activity_works_vote` (
	`id` BIGINT(20) NOT NULL COMMENT 'id',
	`works_id` BIGINT(20) not null COMMENT '参赛作品id',
	`works_uid` int(11) not null COMMENT '作品投稿人',
	`voter_uid` int(11) not null COMMENT '投票人',
	`amount` int(11) not null COMMENT '投票数量',
	`ctime` int(11) NOT NULL COMMENT '创建时间',
    `utime` int(11) NOT NULL COMMENT '更新时间',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='活动参赛作品审核记录表';