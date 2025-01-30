package com.ems.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.entity.Department;
import com.ems.repository.DepartmentRepository;
import com.ems.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Override
	public Department saveDept(Department dept) {
		return departmentRepository.save(dept);
	}

	@Override
	public Department getDept(Long deptId) {
		// TODO Auto-generated method stub
		return departmentRepository.findById(deptId).orElse(null);
	}

	@Override
	public void removeDept(Long deptId) {
		// TODO Auto-generated method stub
		departmentRepository.deleteById(deptId);
	}

	@Override
	public Department updateDept(Department dept) {
		// TODO Auto-generated method stub
		Department oldDept = departmentRepository.findById(dept.getDeptId()).orElse(null);
		oldDept = dept;
		return departmentRepository.save(oldDept);
	}

	@Override
	public List<Department> getAllDepartments() {
		// TODO Auto-generated method stub
		return departmentRepository.findAll();
	}

}
