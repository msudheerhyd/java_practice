package com.dailycodebuffer.Springboottutorial.controller;

import com.dailycodebuffer.Springboottutorial.entity.Department;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @PostMapping("/departments")
    public Department saveDepartment() {


    }
}
