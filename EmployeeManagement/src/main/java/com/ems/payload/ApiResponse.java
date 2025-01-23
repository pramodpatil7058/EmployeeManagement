package com.ems.payload;

import org.springframework.http.HttpStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ApiResponse {
	private String message;
	private HttpStatus httpStatus;
	private boolean success;
}
