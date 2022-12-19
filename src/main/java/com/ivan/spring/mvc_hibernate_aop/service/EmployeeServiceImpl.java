package com.ivan.spring.mvc_hibernate_aop.service;

import com.ivan.spring.mvc_hibernate_aop.dao.EmployeeDAO;
import com.ivan.spring.mvc_hibernate_aop.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeDAO employeeDAO;


    @Override
    @Transactional
    public List<Employee> getAllEmployees() {

        return employeeDAO.getAllEmployees();
    }

    @Override
    @Transactional
    public void saveEmployee(Employee employee) {
        employeeDAO.saveEmployee(employee);
    }

    @Override
    @Transactional
    public Employee getEmmployee(int id) {
        return employeeDAO.getAllEmployee(id);

    }

    @Override
    @Transactional
    public void DeleteEmployee(int id) {

    employeeDAO.deleteEmployee(id);
    }
}
