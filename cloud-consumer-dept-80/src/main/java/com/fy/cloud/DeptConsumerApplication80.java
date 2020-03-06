package com.fy.cloud;

import com.fy.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author fy
 */
@SpringBootApplication
@EnableEurekaClient
// @RibbonClient导入的rule类不能在@ComponentScans()扫描的包下
@RibbonClient(name="CLOUD-DEPT",configuration= MySelfRule.class)
public class DeptConsumerApplication80 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerApplication80.class,args);
    }
}
