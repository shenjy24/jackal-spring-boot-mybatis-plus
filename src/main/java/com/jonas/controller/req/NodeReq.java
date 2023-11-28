package com.jonas.controller.req;

import lombok.Data;

import java.util.List;

/**
 * NodeReq
 *
 * @author shenjy
 * @time 2023/11/28 14:44
 */
@Data
public class NodeReq {
    private Long nodeId;
    private String content;
    private Integer userAge;
    private Long page;
    private Long pageSize;
}
