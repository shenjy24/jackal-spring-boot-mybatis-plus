package com.jonas.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * 【 enter the class description 】
 *
 * @author shenjy 2018/08/12
 */
@Component
public class ShardingConfig {

//    @Autowired
//    @Qualifier("primaryDataSource")
//    private DataSource primaryDataSource;
//
//    @Autowired
//    @Qualifier("secondaryDataSource")
//    private DataSource secondaryDataSource;
//
//    @PostConstruct
//    public void init() {
//        Map<String, DataSource> map = new HashMap<String, DataSource>();
//        map.put("testdb0", primaryDataSource);
//        map.put("testdb1", secondaryDataSource);
//
//    }
}
