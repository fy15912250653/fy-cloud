package com.fy.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@SpringBootApplication
@EnableZuulProxy
public class DeptZuulApplication9527 {
    public static void main(String[] args) {
        SpringApplication.run(DeptZuulApplication9527.class, args);
    }
}
