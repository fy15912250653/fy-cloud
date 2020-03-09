package com.fy.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * EnableEurekaServer EurekaServer服务器端启动类,接受其它微服务注册进来
 *
 * @author fy
 */
@SpringBootApplication
@EnableConfigServer
public class DeptConfigGitApplication3344 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConfigGitApplication3344.class, args);

    }
}
