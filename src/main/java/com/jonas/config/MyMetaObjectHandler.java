package com.jonas.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

/**
 * @author shenjy
 * @createTime 2022/2/24 10:14
 * @description MybatisPlusConfig
 */
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        this.strictInsertFill(metaObject, "ctime", () -> (int) (System.currentTimeMillis() / 1000), Integer.class);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.strictUpdateFill(metaObject, "utime", () -> (int) (System.currentTimeMillis() / 1000), Integer.class);
    }
}
