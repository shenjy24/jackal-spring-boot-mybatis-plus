package com.jonas.enums;

import com.baomidou.mybatisplus.enums.IEnum;

import java.io.Serializable;

/**
 * 【 enter the class description 】
 *
 * @author shenjy 2018/08/13
 */
public enum StatusEnum implements IEnum {

    FREEZE(0, "冻结"),
    NORMAL(1, "正常")
    ;

    private Integer code;
    private String message;

    StatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public Serializable getValue() {
        return this.code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return this.message;
    }
}
