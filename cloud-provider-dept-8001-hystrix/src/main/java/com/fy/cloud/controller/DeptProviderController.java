package com.fy.cloud.controller;

import com.fy.cloud.entities.Dept;
import com.fy.cloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fy
 */
@RestController
public class DeptProviderController {
    @Autowired
    private DeptService deptService;

    @RequestMapping("/dept/{id}")
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Dept dept(@PathVariable("id") int id) {
        Dept dept = deptService.dept(id);
        if (null == dept) {
            throw new RuntimeException("null == dept");
        }
        return dept;
    }

    public Dept processHystrix_Get(@PathVariable("id") int id) {
        Dept dept = new Dept();
        dept.setId(id);
        dept.setName("该ID：" + id + "没有没有对应的信息,null--@HystrixCommand");
        dept.setDbSource("no this database in MySQL");

        return dept;

    }

}
