package com.dailycodebuffer.employeesystemapi.services;

import com.dailycodebuffer.employeesystemapi.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);

    List<Employee> getAllEmployees();
}
