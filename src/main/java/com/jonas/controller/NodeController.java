package com.jonas.controller;

import com.jonas.common.JsonPage;
import com.jonas.controller.req.NodeReq;
import com.jonas.entity.Node;
import com.jonas.service.NodeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * NodeController
 *
 * @author shenjy
 * @time 2023/11/27 18:18
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/node")
public class NodeController {

    private final NodeService nodeService;

    @PostMapping("/query")
    public JsonPage<Node> queryNode(@RequestBody NodeReq req) {
        return nodeService.queryNode(req.getNodeId(), req.getContent(), req.getUserAge(),
                req.getPage(), req.getPageSize());
    }
}
