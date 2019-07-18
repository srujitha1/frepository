package com.sapient.springdemo.dao;

import com.sapient.springdemo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository(value = "mysqlDaoImpl")
public class MySqlemployeeDaoImp implements EmployeeDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public MySqlemployeeDaoImp(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public Employee save(Employee employee) {
        System.out.println("Came inside the save method of MySQLEmployeeDAOImpl");
        jdbcTemplate.execute("insert into Emp(name,id) values('"+employee.getName()+"',2)");
        return employee;
    }

    public List<Employee> listAll() {
        List<Employee> employeeList = jdbcTemplate.query("select * from Emp",(rs,rowNum)->new Employee(rs.getInt(2),rs.getString(1)));
       return employeeList;
    
    }

    public Employee findById(long id1) {
    	 Employee employee=  jdbcTemplate.queryForObject("select name from Emp where id="+id1,(rs,rowNum)->new Employee(rs.getInt(2),rs.getString(1)));
    	 return employee;
    }

    public void deleteEmployee(long id1) {
    	jdbcTemplate.execute("delete from Emp where id="+id1);
    	

    }
}