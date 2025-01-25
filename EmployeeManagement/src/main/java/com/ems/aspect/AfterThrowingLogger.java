package com.ems.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AfterThrowingLogger {
	private static Logger LOGGER = LoggerFactory.getLogger(AfterThrowingLogger.class);
	@Before("execution(* com.ems.service.impl.EmployeeServiceImpl.*(..))")
	public void logBeforeAllMethods(JoinPoint joinPoint, Throwable error) {
		LOGGER.info(joinPoint.getSignature().getName() +" threw "+ error.getMessage());
	}
}
