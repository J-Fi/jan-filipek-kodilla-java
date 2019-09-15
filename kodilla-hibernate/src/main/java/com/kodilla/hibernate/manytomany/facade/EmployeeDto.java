package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDto {
    List<Company> companies = new ArrayList<>();

    public final void addCompany(Company company) {
        companies.add(company);
    }
}
