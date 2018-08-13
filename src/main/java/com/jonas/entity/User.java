package com.jonas.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.jonas.enums.StatusEnum;
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

    @TableId
    private Long userId;

    private String userName;

    private Integer userAge;

    @JSONField(serialzeFeatures = SerializerFeature.WriteEnumUsingToString)
    private StatusEnum userStatus;

    private Long ctime;

    private Long utime;


    @Override
    public Serializable pkVal() {
        return this.userId;
    }
}
