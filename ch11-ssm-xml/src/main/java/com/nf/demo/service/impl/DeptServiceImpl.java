package com.nf.demo.service.impl;

import com.nf.demo.dao.DeptDao;
import com.nf.demo.dao.EmployeeDao;
import com.nf.demo.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 过往云烟~
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;
    @Autowired
    private EmployeeDao employeeDao;
    /*事务 transactional*/
    @Transactional
    @Override
    public void deleteById(int deptid) {
        employeeDao.deleteByDeptId(deptid);
        deptDao.deleteById(deptid);
    }


}
