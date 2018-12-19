package com.flower;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableApolloConfig
public class FlowerApplication {


    public static void main(String[] args) {
        SpringApplication.run(FlowerApplication.class, args);
    }
}
