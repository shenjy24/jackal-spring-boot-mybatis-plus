package com.jonas.component;

import com.jonas.common.DbTypeEnum;
import com.jonas.util.DataSourceContextHolder;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author shenjy
 * @date 2020/7/29
 * @description
 */
@Aspect
@Component
public class DataSourceAspect {
    @Pointcut("execution(* com.jonas.mapper.db1..*.*(..))")
    public void db1Aspect() {
    }

    @Pointcut("execution(* com.jonas.mapper.db2..*.*(..))")
    public void db2Aspect() {
    }

    @Before("db1Aspect()")
    public void db1() {
        DataSourceContextHolder.setDbType(DbTypeEnum.db1);
    }

    @Before("db2Aspect()")
    public void db2() {
        DataSourceContextHolder.setDbType(DbTypeEnum.db2);
    }
}
