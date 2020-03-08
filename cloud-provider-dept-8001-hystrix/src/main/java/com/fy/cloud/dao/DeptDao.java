package com.fy.cloud.dao;

import com.fy.cloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Mapper是 mybatis 的注解
 * Repository是spring的注解
 * @author fy
 */
@Mapper
@Repository
public interface DeptDao {
    /**
     * 根据id获取 dept
     * @param id
     * @return
     */
    Dept getDeptById(@Param("id") int id);
}
