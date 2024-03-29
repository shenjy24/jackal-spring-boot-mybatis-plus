package com.jonas.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jonas.common.JsonPage;
import com.jonas.entity.Node;
import com.jonas.mapper.NodeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * NodeService
 *
 * @author shenjy
 * @time 2023/11/27 17:26
 */
@Service
@RequiredArgsConstructor
public class NodeService {
    private final NodeMapper nodeMapper;

    public Node getNode(Long nodeId) {
        return nodeMapper.selectById(nodeId);
    }

    public JsonPage<Node> queryNode(Long nodeId, String content, Integer age, long pageNum, long pageSize) {
        Page<Node> page = new Page<>(pageNum, pageSize);
        IPage<Node> pageResult = nodeMapper.queryNode(page, nodeId, content, age);

        return new JsonPage<>(pageResult.getTotal(), pageResult.getRecords());
    }
}
