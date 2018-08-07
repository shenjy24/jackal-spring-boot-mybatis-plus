package com.jonas.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.io.Serializable;

/**
 * 【 enter the class description 】
 *
 * @author shenjy 2018/08/06
 */
@Data
@TableName("user")
public class User extends Model<User> implements Serializable {

    @TableId(value = "user_id", type = IdType.ID_WORKER)
    private Long userId;

    @TableField(value = "user_name")
    private String userName;

    @TableField(value = "user_age")
    private Integer userAge;

    @TableField(value = "ctime")
    private Long ctime;

    @TableField(value = "utime")
    private Long utime;

    @Override
    public Serializable pkVal() {
        return this.userId;
    }
}
