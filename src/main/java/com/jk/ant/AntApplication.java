package com.jk.ant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class AntApplication {

    public static void main(String[] args) {
        SpringApplication.run(AntApplication.class, args);
    }

}
