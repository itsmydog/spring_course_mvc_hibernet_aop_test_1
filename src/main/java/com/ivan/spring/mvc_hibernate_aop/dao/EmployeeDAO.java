package com.ivan.spring.mvc_hibernate_aop.dao;

import com.ivan.spring.mvc_hibernate_aop.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();


     public void saveEmployee(Employee employee);

   public Employee getAllEmployee(int id);

     public void deleteEmployee(int id);
}
