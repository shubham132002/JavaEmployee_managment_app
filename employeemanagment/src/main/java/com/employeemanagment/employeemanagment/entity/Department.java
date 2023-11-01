package com.employeemanagment.employeemanagment.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;
    private String departmentName;
     private String managerAge;
     @NotNull
    private Long salary;
    private Long tds;
    private Long afterTaxSalary;

    public Department() {
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                ", managerAge='" + managerAge + '\'' +
                ", salary=" + salary +
                ", tds='" + tds + '\'' +
                ", afterTaxSalary=" + afterTaxSalary +
                '}';
    }

    public Department(Long departmentId, String departmentName, String managerAge, Long salary, Long tds, Long afterTaxSalary) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.managerAge = managerAge;
        this.salary = salary;
        this.tds = tds;
        this.afterTaxSalary = afterTaxSalary;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getManagerAge() {
        return managerAge;
    }

    public void setManagerAge(String managerAge) {
        this.managerAge = managerAge;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public Long getTds() {
        return tds;
    }

    public void setTds(Long tds) {
        this.tds = tds;
    }

    public Long getAfterTaxSalary() {
        return afterTaxSalary;
    }

    public void setAfterTaxSalary(Long afterTaxSalary) {
        this.afterTaxSalary = afterTaxSalary;
    }
}
