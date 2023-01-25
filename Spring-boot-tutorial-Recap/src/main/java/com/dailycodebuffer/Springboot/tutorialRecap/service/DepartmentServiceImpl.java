package com.dailycodebuffer.Springboot.tutorialRecap.service;

import com.dailycodebuffer.Springboot.tutorialRecap.entity.Department;
import com.dailycodebuffer.Springboot.tutorialRecap.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchDepartmentList() {
        return departmentRepository.findAll();
    }
}
