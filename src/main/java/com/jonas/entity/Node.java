package com.jonas.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * Node
 *
 * @author shenjy
 * @time 2023/11/27 16:33
 */
@Data
public class Node {
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;
    private String name;
    private Long parentId;
    private Long userId;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
