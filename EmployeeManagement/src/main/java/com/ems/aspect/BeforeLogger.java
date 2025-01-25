package com.ems.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BeforeLogger {
	private static Logger LOGGER = LoggerFactory.getLogger(BeforeLogger.class);
	
	@Before("execution(* com.ems.service.impl.EmployeeServiceImpl.*(..))")
	public void logBeforeAllMethods(JoinPoint joinPoint) {
		LOGGER.info("This is before "+ joinPoint.getSignature().getName());
		Object args[] = joinPoint.getArgs();
		LOGGER.info("The arguments are: ");
		for(Object arg : args) {
			LOGGER.info("{}",arg);
		}
	}
	@Before("execution(* com.ems.service.impl.EmployeeServiceImpl.deleteEmployee(..))")
	public void logBeforeDeleteEmployee() {
		LOGGER.info("Delete method execution started.");
	}

	@Before("execution(* com.ems.service.impl.EmployeeServiceImpl.getAllEmployeesBetweenSalaries(..))")
	public void logBeforeGetAllEmployeesBetweenSalaries() {
		LOGGER.info("getAllEmployeesBetweenSalaries method execution started.");
	}

	@Before("execution(* com.ems.service.impl.EmployeeServiceImpl.getEmployeesBasedOnDesg(..))")
	public void logBeforeGetEmployeesBasedOnDesg() {
		LOGGER.info("GetEmployeesBasedOnDesg method execution started.");
	}
	@Before("execution(* com.ems.service.impl.EmployeeServiceImpl.updateEmployee(..))")
	public void logBeforeUpdateEmployee() {
		LOGGER.info("UpdateEmployee method execution started.");
	}
	@Before("execution(* com.ems.service.impl.EmployeeServiceImpl.getAllEmployees(..))")
	public void logBeforeGetAllEmployees() {
		LOGGER.info("GetAllEmployees method execution started.");
	}
	@Before("execution(* com.ems.service.impl.EmployeeServiceImpl.getEmployeeById(..))")
	public void logBeforeGetEmployeeById() {
		LOGGER.info("GetEmployeeById method execution started.");
	}
	@Before("execution(* com.ems.service.impl.EmployeeServiceImpl.addEmployee(..))")
	public void logBeforeAddEmployee() {
		LOGGER.info("AddEmployee method execution started.");
	}
}
