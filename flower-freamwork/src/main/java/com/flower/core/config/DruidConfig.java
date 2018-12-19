package com.flower.core.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "datasource")
@Data
public class DruidConfig {

    private String url;
    private String username;
    private String password;
    private String driverClassName;
    private Integer initialSize;
    private Integer maxActive;


}
