package com.employeemanagment.employeemanagment.controller;


import com.employeemanagment.employeemanagment.entity.Department;
import com.employeemanagment.employeemanagment.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class DepartmentController {


    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department) {
        return departmentService.saveDepartment(department);

    }

    @GetMapping("/departments")
    public List<Department>fetchDepartmentList(){
        return departmentService.fetchDepartmentList();
    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id")Long departmentId){
        return departmentService.fetchDepartmentById(departmentId);
    }

    @PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId,@RequestBody Department department){
        return departmentService.updateDepartment(departmentId,department);
    }

    @GetMapping("/secured")
    public String secured(){
        return "hello,Secured!";
    }







}
