package com.employeemanagment.employeemanagment.controller;

import com.employeemanagment.employeemanagment.entity.Performance;
import com.employeemanagment.employeemanagment.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class PerformanceController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/performance")
    public Performance savePerformance(@Valid @RequestBody Performance performance){
        return departmentService.savePerformance(performance);
    }

}
