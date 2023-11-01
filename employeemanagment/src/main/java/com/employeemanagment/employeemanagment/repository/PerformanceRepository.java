package com.employeemanagment.employeemanagment.repository;

import com.employeemanagment.employeemanagment.entity.Department;
import com.employeemanagment.employeemanagment.entity.Performance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PerformanceRepository extends JpaRepository<Performance,Long> {
}
