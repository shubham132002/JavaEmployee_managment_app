package com.employeemanagment.employeemanagment.repository;

import com.employeemanagment.employeemanagment.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long>  {
}
