package com.ems.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AroundLogger {

	private final Logger LOGGER = LoggerFactory.getLogger(AroundLogger.class);
	
	@Around("execution(* com.ems.service.impl.EmployeeServiceImpl.*(..))")
	public Object logAroundAllMethod(ProceedingJoinPoint joinPoint) {
		Object args[] = joinPoint.getArgs();
		for(Object arg: args) {
			LOGGER.info("Around args {}", arg);
		}	
		Object result = null;
		try {
			result = joinPoint.proceed();
			LOGGER.info("METHOD RESULT {}",result);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			LOGGER.info("Exception occured {}",e.getMessage());
		}finally {
			LOGGER.info("Exiting method {}",joinPoint.getSignature().getName());
		}
		return result;
	
	}
}
