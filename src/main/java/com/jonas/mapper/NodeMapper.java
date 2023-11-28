package com.jonas.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;
import com.jonas.entity.Node;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * NodeMapper
 *
 * @author shenjy
 * @time 2023/11/27 17:22
 */
@Mapper
public interface NodeMapper extends BaseMapper<Node> {

    @Select("WITH RECURSIVE NodeCTE AS (" +
            "SELECT id, name, parent_id, user_id from node where id = #{nodeId} " +
            "UNION ALL " +
            "SELECT nd.id, nd.name, nd.parent_id, nd.user_id from node nd " +
            "INNER JOIN NodeCTE ncte ON nd.parent_id = ncte.id) " +
            "SELECT id from NodeCTE where name like CONCAT('%', #{content}, '%') and user_id in " +
            "(select user_id from user where user_age = #{userAge})")
    IPage<Node> queryNode(Page<?> page,
                          @Param("nodeId") Long nodeId,
                          @Param("content") String content,
                          @Param("userAge") Integer userAge);
}
