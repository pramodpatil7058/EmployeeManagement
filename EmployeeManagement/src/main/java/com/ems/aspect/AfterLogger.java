package com.ems.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class AfterLogger {
	
	private final Logger LOGGER = LoggerFactory.getLogger(AfterLogger.class);
	
	

	@After("execution(* com.ems.service.impl.EmployeeServiceImpl.*(..))")
	public void logAfterAllMethods() {
		LOGGER.info("This is After methods");
	}
	@After("execution(* com.ems.service.impl.EmployeeServiceImpl.deleteEmployee(..))")
	public void logAfterDeleteEmployee() {
		LOGGER.info("Delete method execution Completed.");
	}

	@After("execution(* com.ems.service.impl.EmployeeServiceImpl.getAllEmployeesBetweenSalaries(..))")
	public void logAfterGetAllEmployeesBetweenSalaries() {
		LOGGER.info("getAllEmployeesBetweenSalaries method execution Completed.");
	}

	@After("execution(* com.ems.service.impl.EmployeeServiceImpl.getEmployeesBasedOnDesg(..))")
	public void logAfterGetEmployeesBasedOnDesg() {
		LOGGER.info("GetEmployeesBasedOnDesg method execution Completed.");
	}
	@After("execution(* com.ems.service.impl.EmployeeServiceImpl.updateEmployee(..))")
	public void logAfterUpdateEmployee() {
		LOGGER.info("UpdateEmployee method execution Completed.");
	}
	@After("execution(* com.ems.service.impl.EmployeeServiceImpl.getAllEmployees(..))")
	public void logAfterGetAllEmployees() {
		LOGGER.info("GetAllEmployees method execution Completed.");
	}
	@After("execution(* com.ems.service.impl.EmployeeServiceImpl.getEmployeeById(..))")
	public void logAfterGetEmployeeById() {
		LOGGER.info("GetEmployeeById method execution Completed.");
	}
	@After("execution(* com.ems.service.impl.EmployeeServiceImpl.addEmployee(..))")
	public void logAfterAddEmployee() {
		LOGGER.info("AddEmployee method execution Completed.");
	}
}
