package com.fy.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * EnableEurekaServer EurekaServer服务器端启动类,接受其它微服务注册进来
 *
 * @author fy
 */
@SpringBootApplication
@EnableEurekaServer
public class DeptEurekaApplication7001 {
    public static void main(String[] args) {
        SpringApplication.run(DeptEurekaApplication7001.class, args);
    }
}
