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
public class PrimaryDataSourceConfig {

    @Value("${spring.datasource.primary.url}")
    private String dbUrl;

    @Value("${spring.datasource.primary.username}")
    private String username;

    @Value("${spring.datasource.primary.password}")
    private String password;

    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;

    /**
     * 在同样的DataSource中，首先使用被标注的DataSource
     * @return
     */
    @Primary
    @Bean(name = "primaryDataSource")
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
