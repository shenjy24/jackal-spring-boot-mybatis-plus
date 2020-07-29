package com.jonas.common;

/**
 * 【 enter the class description 】
 *
 * @author shenjy 2018/08/13
 */
public enum StatusEnum {

    FREEZE(0, "冻结"),
    NORMAL(1, "正常")
    ;

    private Integer code;
    private String message;

    StatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
