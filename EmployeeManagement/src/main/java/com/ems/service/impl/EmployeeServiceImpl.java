package com.ems.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.entity.Employee;
import com.ems.exception.ResourceNotFoundException;
import com.ems.repository.EmployeeRepository;
import com.ems.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee addEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public Employee getEmployeeById(int empId) {
		return employeeRepository.findById(empId).orElse(null);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Employee oldEmp = employeeRepository.findById(employee.getEmpId()).orElse(null);
		if (oldEmp == null) {
			throw new ResourceNotFoundException("Employee with ID Not found");
		}
		oldEmp = employee;
		return employeeRepository.save(oldEmp);
	}

	@Override
	public String deleteEmployee(int empId) {
		Employee emp = employeeRepository.findById(empId).orElse(null);
		if(emp == null) {
			throw new ResourceNotFoundException("Employee ID does not exist.");
		}
		employeeRepository.deleteById(empId);
		return "Done";
	}

	@Override
	public List<Employee> getAllEmployeesBetweenSalaries(int initialSal, int finalSal) {
		// TODO Auto-generated method stub
//		return employeeRepository.findAllEmployeesBetweenSalaries(initialSal, finalSal);
		return employeeRepository.findByEmpSalBetween(initialSal, finalSal);
	}

}
