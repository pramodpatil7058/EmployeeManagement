package com.ems.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ems.entity.Department;


@Service
public interface DepartmentService {

	public Department saveDept(Department dept);
	
	public Department getDept(Long deptId);
	
	public void removeDept(Long deptId);
	
	public Department updateDept(Department dept);

	public List<Department> getAllDepartments();
	
}
