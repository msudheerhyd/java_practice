package com.dailycodebuffer.Springboottutorial.repository;

import com.dailycodebuffer.Springboottutorial.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    public Department findByDepartmentName(String departmentName);

    @Query(value = "", nativeQuery = true)
    public Department findByDepartmentNameIgnoreCase(String departmentName);

    @Query(value = "", nativeQuery = true)
    Department findByDepartmentAddressIgnoreCase(String departmentAddress);
}
