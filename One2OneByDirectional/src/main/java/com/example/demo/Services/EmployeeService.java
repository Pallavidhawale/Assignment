package com.example.demo.Services;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Model.Employee;
@Service
public interface EmployeeService {
    public EmployeeService saveEmployee(Employee employee);
    public List<Employee> listEmployee();
    public EmployeeService updateEmployee(EmployeeService employee);
    public String deleteEmployee(EmployeeService employee);
	Employee saveEmployee1(Employee employee);
	Employee updateEmployee(Employee employee);
	String deleteEmployee(Employee employee);
}