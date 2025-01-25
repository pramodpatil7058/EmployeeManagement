package com.ems.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AfterReturningLogger {

	private final Logger LOGGER = LoggerFactory.getLogger(AfterReturningLogger.class);
	
	@AfterReturning("execution(* com.ems.service.impl.EmployeeServiceImpl.*(..))")
	public void logAfterReturningAllMethods(Object result) {
		LOGGER.info("After returning {}", result);
	}
}
