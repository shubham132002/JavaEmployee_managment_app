package com.employeemanagment.employeemanagment.service;

import com.employeemanagment.employeemanagment.entity.Department;
import com.employeemanagment.employeemanagment.entity.Performance;

import javax.persistence.TableGenerator;
import javax.transaction.Transactional;
import java.util.List;

public interface DepartmentService {

   public Department saveDepartment(Department department);

   public List<Department> fetchDepartmentList();

   public Department fetchDepartmentById(Long departmentId);

   public Department updateDepartment(Long departmentId,Department department);

   public Performance savePerformance(Performance performance);

   public void updateCommon(Department department,Performance performance);
}


