package com.example.demo.Service_implementation;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Model.Employee;
import com.example.demo.Repositories.EmployeeRepository;
import com.example.demo.Services.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;
 
    @Override
    public Employee saveEmployee1(Employee employee) {
        // TODO Auto-generated method stub
        return employeeRepository.save(employee);
    }
 
    @Override
    public List<Employee> listEmployee() {
        // TODO Auto-generated method stub
        return employeeRepository.findAll();
    }
 
    @Override
    public Employee updateEmployee(Employee employee) {
        // TODO Auto-generated method stub
        return null;
    }
 
    @Override
    public String deleteEmployee(Employee employee) {
        // TODO Auto-generated method stub
        return null;
    }

	@Override
	public EmployeeService saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeService updateEmployee(EmployeeService employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteEmployee(EmployeeService employee) {
		// TODO Auto-generated method stub
		return null;
	}
 
}