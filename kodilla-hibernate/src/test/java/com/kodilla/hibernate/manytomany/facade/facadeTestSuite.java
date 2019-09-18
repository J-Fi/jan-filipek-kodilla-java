package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class facadeTestSuite {
    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    Facade facade;

    @Test
    public void testFacade() {
    //Given
    Employee johnSmith = new Employee("John", "Smith");
    Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
    Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

    Company softwareMachine = new Company("Software Machine");
    Company dataMaesters = new Company("Data Maesters");
    Company greyMatter = new Company("Grey Matter");

    softwareMachine.getEmployees().add(johnSmith);
    dataMaesters.getEmployees().add(stephanieClarckson);
    dataMaesters.getEmployees().add(lindaKovalsky);
    greyMatter.getEmployees().add(johnSmith);
    greyMatter.getEmployees().add(lindaKovalsky);

    johnSmith.getCompanies().add(softwareMachine);
    johnSmith.getCompanies().add(greyMatter);
    stephanieClarckson.getCompanies().add(dataMaesters);
    lindaKovalsky.getCompanies().add(dataMaesters);
    lindaKovalsky.getCompanies().add(greyMatter);

    //When
    companyDao.save(softwareMachine);
    int softwareMachineId = softwareMachine.getId();
    companyDao.save(dataMaesters);
    int dataMaestersId = dataMaesters.getId();
    companyDao.save(greyMatter);
    int greyMatterId = greyMatter.getId();

    List<Company> companyNameByPartName = facade.findCompanyNames("%ter%");
    List<Employee> employeeNameByPartName = facade.findEmployeeNames("%val%");

    //Then
        Assert.assertEquals(2, companyNameByPartName.size());
        Assert.assertEquals(1, employeeNameByPartName.size());

    //CleanUp
        try {
        companyDao.deleteById(softwareMachineId);
        companyDao.deleteById(dataMaestersId);
        companyDao.deleteById(greyMatterId);
    } catch (Exception e) {
        //do nothing
    }
}
}
