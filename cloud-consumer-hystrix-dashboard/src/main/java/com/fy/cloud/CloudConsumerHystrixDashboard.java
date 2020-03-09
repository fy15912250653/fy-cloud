package com.fy.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;


@SpringBootApplication
@EnableHystrixDashboard
public class CloudConsumerHystrixDashboard {
    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerHystrixDashboard.class, args);
    }
}
