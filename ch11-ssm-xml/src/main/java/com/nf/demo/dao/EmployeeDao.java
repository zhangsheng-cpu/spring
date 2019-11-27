package com.nf.demo.dao;

import com.nf.demo.entity.EmployeeEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeDao {

    List<EmployeeEntity> getAll(@Param("pageNum")int PageNum,
                                @Param("pageSize")int PageSize);

    void insert(EmployeeEntity employeeEntity);

    void deleteByDeptId(int deptid);
}
