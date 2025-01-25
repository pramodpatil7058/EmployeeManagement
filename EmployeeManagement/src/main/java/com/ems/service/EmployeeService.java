package com.ems.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ems.entity.Employee;

@Service
public interface EmployeeService {

	public Employee addEmployee(Employee employee);

	public Employee getEmployeeById(int empId);

	public List<Employee> getAllEmployees();

	public Employee updateEmployee(Employee employee);
	
	public String deleteEmployee(int empId);
	
	public List<Employee> getAllEmployeesBetweenSalaries(int initialSal, int finalSal);
	
	public List<Employee> getEmployeesBasedOnDesg(String empDesg);
}
