package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Facade {
    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    public Facade() {
    }

    public List<Company> findCompanyNames(String partName) {
        return companyDao.retrieveCompanyNamesFromPartOfName(partName);
    }

    public List<Employee> findEmployeeNames(String part) {
        return employeeDao.retrieveEmployeeNameFromPartOfIt(part);
    }
}
