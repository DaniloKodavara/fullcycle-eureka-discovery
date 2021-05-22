package com.fourleaf.farenheitclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FarenheitclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(FarenheitclientApplication.class, args);
    }

}
