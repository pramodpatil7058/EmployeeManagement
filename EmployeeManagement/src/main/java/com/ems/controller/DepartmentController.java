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
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;

import com.ems.entity.Department;
import com.ems.service.DepartmentService;

@RestController
@RequestMapping("/dept")
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	@PostMapping
	public Department saveDept(@RequestBody Department department) {
		return departmentService.saveDept(department);
	}
	
	@GetMapping
	public List<Department> getAllDepartments(){
		return departmentService.getAllDepartments();
	}
	
	@GetMapping("/{deptId}")
	public Department getDept(@PathVariable Long deptId) {
		return departmentService.getDept(deptId);
	}
	
	@DeleteMapping("/{deptId}")
	public void removeDept(@PathVariable Long deptId) {
		System.out.println("Dept ID : "+deptId);
		departmentService.removeDept(deptId);
	}
	
	@PutMapping
	public Department updateDepartment(@RequestBody Department dept) {
		return departmentService.updateDept(dept);
	}
}
