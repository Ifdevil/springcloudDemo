package com.npz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages = "com.npz.eurakeclient")
public class EurakeclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurakeclientApplication.class, args);
    }
}
