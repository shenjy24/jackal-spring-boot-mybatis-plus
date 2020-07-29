package com.jonas.util;

import com.jonas.common.DbTypeEnum;

/**
 * @author shenjy
 * @date 2020/7/29
 * @description
 */
public class DataSourceContextHolder {
    //实际上就是开启多个线程，每个线程进行初始化一个数据源
    private static final ThreadLocal contextHolder = new ThreadLocal<>();
    /**
     * 设置数据源
     * @param dbTypeEnum
     */
    public static void setDbType(DbTypeEnum dbTypeEnum) {
        contextHolder.set(dbTypeEnum.name());
    }

    /**
     * 取得当前数据源
     * @return
     */
    public static String getDbType() {
        return (String) contextHolder.get();
    }

    /**
     * 清除上下文数据
     */
    public static void clearDbType() {
        contextHolder.remove();
    }
}
