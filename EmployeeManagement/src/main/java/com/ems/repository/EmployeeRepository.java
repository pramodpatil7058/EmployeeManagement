package com.ems.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ems.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
//	@Query("select e from Employee e where e.empSal between ?1 and ?2")
//	public List<Employee> findAllEmployeesBetweenSalaries(int initalSal, int finalSal);
	public List<Employee> findByEmpSalBetween(int initialSal, int finalSal);
}
