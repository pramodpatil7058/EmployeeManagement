package com.ems.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ems.payload.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {
	public ResponseEntity<ApiResponse> exceptionHandler(ResourceNotFoundException e) {
		ApiResponse response = ApiResponse.builder().message(e.getMessage()).httpStatus(HttpStatus.NOT_FOUND).success(true).build();
		return new ResponseEntity<ApiResponse>(response, HttpStatus.NOT_FOUND);
	}
}
