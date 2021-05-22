package com.fourleaf.kelvinclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class KelvinclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(KelvinclientApplication.class, args);
    }

}
