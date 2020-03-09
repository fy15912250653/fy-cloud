package com.fy.cloud.controller;

import com.fy.cloud.entities.Dept;
import com.fy.cloud.service.DeptService;
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
    public Dept dept(@PathVariable("id") int id) {
        return deptService.dept(id);
    }
}
