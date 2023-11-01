package com.employeemanagment.employeemanagment.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Performance {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;
    @NotNull
    private Long hours;
    private String position;

    public Performance() {
    }

    public Performance(Long hours, String position) {
        this.hours = hours;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Performance{" +
                "hours=" + hours +
                ", position='" + position + '\'' +
                '}';
    }

    public Long getHours() {
        return hours;
    }

    public void setHours(Long hours) {
        this.hours = hours;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
