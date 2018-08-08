package com.jonas.entity;

import java.io.Serializable;

/**
 * <p>
 * 订单表
 * </p>
 *
 * @author Jonas
 * @since 2018-08-08
 */
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 订单id
     */
    private Long orderId;
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 用户名
     */
    private String userName;


    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Order{" +
        ", orderId=" + orderId +
        ", userId=" + userId +
        ", userName=" + userName +
        "}";
    }
}
