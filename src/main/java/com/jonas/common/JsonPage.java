package com.jonas.common;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * JsonPage
 *
 * @author shenjy
 * @time 2023/11/27 18:13
 */
@Data
public class JsonPage<T> {
    // 总条数
    private long total;
    // 当前页数据列表
    private List<T> elements;

    public JsonPage() {
        this.total = 0L;
        this.elements = new ArrayList<>();
    }

    public JsonPage(long total, List<T> elements) {
        this.total = total;
        this.elements = elements;
    }
}
