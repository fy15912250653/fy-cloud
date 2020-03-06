package fy.cloud.controller;

import com.fy.cloud.entities.Dept;
import com.fy.cloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fy
 */
@RestController
public class DeptConsumerController {

    @Autowired
    private DeptClientService deptClientService;

    @RequestMapping(value = "/consumer/dept/{id}",method = RequestMethod.GET)
    public Dept dept(@PathVariable("id") int id) {
        return deptClientService.dept(id);
    }

}
