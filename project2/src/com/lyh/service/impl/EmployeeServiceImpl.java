package com.lyh.service.impl;

import com.lyh.dao.EmployeeMapper;
import com.lyh.model.Employee;
import com.lyh.service.EmployeeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService{
    @Resource
    private EmployeeMapper employeeMapper;

    @Override
    public Employee findEmployee(Employee employee) {
        return employeeMapper.findEmployee(employee);
    }

    @Override
    public Employee findEmployeeById(Employee employee) {
        return employeeMapper.findEmployeeById(employee);
    }

    @Override
    public List<Employee> employeelist() {
        return employeeMapper.employeelist();
    }

    @Override
    public boolean addEmployee(Employee employee) {
        return employeeMapper.addEmployee(employee);
    }

    @Override
    public boolean updateEmployee(Employee employee) {
        return employeeMapper.updateEmployee(employee);
    }
}
