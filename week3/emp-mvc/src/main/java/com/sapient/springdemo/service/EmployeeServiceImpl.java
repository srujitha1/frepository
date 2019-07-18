package com.sapient.springdemo.service;

import com.sapient.springdemo.dao.EmployeeDAO;
import com.sapient.springdemo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/*@Component*/
@Service(value = "employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired( required = true)
    @Qualifier(value = "mysqlDaoImpl")
    private EmployeeDAO employeeDAO;

    public EmployeeServiceImpl(@Qualifier(value = "mysqlDaoImpl")EmployeeDAO employeeDAO){
        this.employeeDAO = employeeDAO;
    }

    public Employee saveEmployee(Employee employee) {
        return employeeDAO.save(employee);
    }

    public List<Employee> fetchAllEmployees() {
    	return employeeDAO.listAll();
    }

    public Employee findById(long id) {
    	return employeeDAO.findById(id);
    }

    public void deleteEmployee(long id) {
    	employeeDAO.deleteEmployee(id);
    }
}