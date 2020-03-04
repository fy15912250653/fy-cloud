package com.fy.cloud.controller;

import com.fy.cloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author fy
 */
@RestController
public class DeptConsumerController {

    private static final String REST_URL_PREFIX = "http://localhost:8001";


    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/consumer/dept/{id}")
    public Dept dept(@PathVariable("id") int id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/" + id, Dept.class);
    }

}
