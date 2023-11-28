package com.jonas.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Node
 *
 * @author shenjy
 * @time 2023/11/27 16:33
 */
@Data
@TableName(value = "node", autoResultMap = true)
public class Node {
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;
    private String name;
    private Long parentId;
    private Long userId;
    @TableField(typeHandler = JacksonTypeHandler.class)
    private List<String> classIds;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
