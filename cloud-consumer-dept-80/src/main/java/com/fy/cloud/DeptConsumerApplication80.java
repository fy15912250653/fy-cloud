package com.fy.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author fy
 */
@SpringBootApplication
@EnableEurekaClient
public class DeptConsumerApplication80 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerApplication80.class,args);
    }
}
