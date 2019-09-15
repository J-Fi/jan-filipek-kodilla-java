package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;

import java.util.ArrayList;
import java.util.List;

public class CompanyDto {
    List<Employee> employees = new ArrayList<>();

    public final void addEmployee(Employee employee) {
        employees.add(employee);
    }
}
