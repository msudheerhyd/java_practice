package com.dailycodebuffer.Springboot.tutorialRecap.service;

import com.dailycodebuffer.Springboot.tutorialRecap.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();
}
