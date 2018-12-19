package com.flower.core.config;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableApolloConfig("datasource")
public class AppConfig {

    @Bean
    public DruidConfig druidConfig() {
        return new DruidConfig();
    }
}
