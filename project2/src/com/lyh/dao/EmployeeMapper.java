package com.lyh.dao;

import com.lyh.model.Employee;

import java.util.List;

public interface EmployeeMapper {
    Employee findEmployee(Employee employee);//����Ա�������������ѯ
    Employee findEmployeeById(Employee employee);//����Ա��id��ѯ
    List<Employee> employeelist();//��ѯ���е�Ա��
    boolean addEmployee(Employee employee);//����µ�Ա��
    boolean updateEmployee(Employee employee);//�޸�Ա����Ϣ
}
