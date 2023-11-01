package com.employeemanagment.employeemanagment.service;

import com.employeemanagment.employeemanagment.entity.Department;
import com.employeemanagment.employeemanagment.entity.Performance;
import com.employeemanagment.employeemanagment.repository.DepartmentRepository;
import com.employeemanagment.employeemanagment.repository.PerformanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service


public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;
    @Autowired
    private PerformanceRepository performanceRepository;

    @Override

    public Department saveDepartment(Department department) {
        return departmentRepository.save(department) ;
    }

    @Override
    public List<Department> fetchDepartmentList() {
        return departmentRepository.findAll();
    }

    @Override
    public Department fetchDepartmentById(Long departmentId) {
        return departmentRepository.findById(departmentId).get();
    }

    @Override
    public Department updateDepartment(Long departmentId,Department department) {
        Department depDB=departmentRepository.findById(departmentId).get();
        depDB.setAfterTaxSalary(department.getSalary()-department.getTds()*department.getSalary()/100);
        return departmentRepository.save(depDB);
    }

    @Override
    public Performance savePerformance(Performance performance) {
        return performanceRepository.save(performance);
    }
    @Transactional(propagation = Propagation.MANDATORY)
    public void updateCommon(Department department,Performance performance){
        saveDepartment(department);
        savePerformance(performance);
    }
}
