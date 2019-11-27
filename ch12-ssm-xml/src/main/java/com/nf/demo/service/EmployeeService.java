package com.nf.demo.service;

import com.nf.demo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAll(int pageNum, int pageSize);

    void insert(Employee employee);
}
