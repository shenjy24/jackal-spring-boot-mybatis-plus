package com.jonas.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

import javax.sql.DataSource;

/**
 * 【 enter the class description 】
 *
 * @author shenjy 2018/08/12
 */
@Configuration
public class SecondaryDataSourceConfig {

    @Value("${spring.datasource.secondary.url}")
    private String dbUrl;

    @Value("${spring.datasource.secondary.username}")
    private String username;

    @Value("${spring.datasource.secondary.password}")
    private String password;

    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;

    @Bean(name = "secondaryDataSource")
    public DataSource dataSource(){
        DruidDataSource datasource = new DruidDataSource();

        datasource.setUrl(dbUrl);
        datasource.setUsername(username);
        datasource.setPassword(password);
        datasource.setDriverClassName(driverClassName);

        return datasource;
    }

    //启动占位符功能
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
        configurer.setLocation(new ClassPathResource("application.properties"));
        return configurer;
    }
}
