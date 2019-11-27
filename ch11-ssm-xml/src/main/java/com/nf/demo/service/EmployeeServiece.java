package com.nf.demo.service;

import com.nf.demo.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeServiece {

    List<EmployeeEntity> getAll(int PageNum, int PageSize);

    void insert(EmployeeEntity employeeEntity);

}
