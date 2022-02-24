package com.jonas.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 * 【 enter the class description 】
 *
 * @author shenjy 2018/08/06
 */
@Data
@TableName("user")
public class User implements Serializable {

    @TableId(type = IdType.ASSIGN_UUID)
    private String userId;

    private String userName;

    private Integer userAge;

    private Integer userStatus;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;
}
