package com.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ems.entity.Employee;
import com.ems.exception.ResourceNotFoundException;
import com.ems.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService empService;

	@PostMapping("/saveEmployee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return empService.addEmployee(employee);
	}

	@GetMapping("/getEmployeeById/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		Employee emp = empService.getEmployeeById(id);
		if (emp == null) {
			throw new ResourceNotFoundException("Employee Id does not exist");
		}
		return emp;
	}

	@DeleteMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable("id") int empId) {
		return empService.deleteEmployee(empId);
	}

	@GetMapping("/getAllEmployees")
	public List<Employee> getAllEmployees() {
		return empService.getAllEmployees();
	}

	@PutMapping("/updateEmployee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		Employee updatedEmployee = empService.updateEmployee(employee);
		if (updatedEmployee == null) {
			throw new ResourceNotFoundException("Employee Not found");
		}
		return updatedEmployee;
	}

	@GetMapping("/getAllEmployeesBetweenSalaries")
	public List<Employee> getAllEmployeesBetweenSalaries(@RequestParam("initialSal") int initialSal,
			@RequestParam("finalSal") int finalSal) {
		return empService.getAllEmployeesBetweenSalaries(initialSal, finalSal);
	}

}
