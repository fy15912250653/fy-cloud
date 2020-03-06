package fy.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author fy
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.fy.cloud"})
@ComponentScan("com.fy.cloud")
public class DeptConsumerApplication80Feign {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerApplication80Feign.class,args);
    }
}
