package com.fy.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author fy
 * EnableEurekaClient本服务启动后会自动注册进eureka服务中
 */
@SpringBootApplication
@EnableEurekaClient
public class DeptProviderApplication8001 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProviderApplication8001.class, args);
    }
}
