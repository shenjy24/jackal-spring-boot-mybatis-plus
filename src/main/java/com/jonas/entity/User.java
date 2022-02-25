package com.jonas.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

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

    private boolean login;

    @TableField(fill = FieldFill.INSERT)
    private Integer ctime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Integer utime;
}
