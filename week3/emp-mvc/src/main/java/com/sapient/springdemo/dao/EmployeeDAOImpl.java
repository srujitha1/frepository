package com.sapient.springdemo.dao;

import com.sapient.springdemo.model.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeDAOImpl implements EmployeeDAO {

    private static List<Employee> employees = new ArrayList<Employee>();
@Autowired
private JdbcTemplate jdbcTemplate;

    public Employee save(Employee employee) {
        employees.add(employee);
        jdbcTemplate.batchUpdate();
        System.out.println("inside the save method of EMployeeDAO");
        System.out.println("Saved "+employee.getName());
        return employee;
    }

    public List<Employee> listAll() {
        System.out.println("Inside the list all method of EmployeeDAO");
        return null;
    }

    public Employee findById(long id) {
        System.out.println("Inside the findBYId method of EmployeeDAO");
        return null;
    }

    public void deleteEmployee(long id) {
        System.out.println("inside the delete method of EmployeeDAO");
    }
}