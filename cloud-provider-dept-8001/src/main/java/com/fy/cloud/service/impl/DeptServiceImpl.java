package com.fy.cloud.service.impl;

import com.fy.cloud.dao.DeptDao;
import com.fy.cloud.entities.Dept;
import com.fy.cloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author fy
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    public Dept dept(int id) {
        return deptDao.getDeptById(id);
    }
}
