package com.flower.core.configuration;

import com.alibaba.druid.pool.DruidDataSource;
import com.flower.core.config.DruidConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DruidConfiguration {

    @Autowired
    private DruidConfig druidConfig;


    @Bean(name="dataSource")
    public DataSource createDruidDatasource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(druidConfig.getUrl());
        dataSource.setDriverClassName(druidConfig.getDriverClassName());
        dataSource.setUsername(druidConfig.getUsername());
        dataSource.setPassword(druidConfig.getPassword());
        dataSource.setInitialSize(druidConfig.getInitialSize());
        dataSource.setMaxActive(druidConfig.getMaxActive());
        return dataSource;
    }
}
