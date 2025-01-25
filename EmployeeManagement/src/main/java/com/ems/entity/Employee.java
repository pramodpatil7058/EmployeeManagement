package com.ems.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "employees")
public class Employee {
	@Id
	@NotNull(message = "Employee Id cannot be null")
	private int empId;
	@Column(name = "empname")
	@NotBlank(message = "Name is Mandatory")
	@Size(min = 3, max = 50, message = "Name should be in between 3 and 50 characters")
	private String empName;
	@Column(name = "empsal", nullable = false)
	@Min(value = 1000, message = "Employee salary should be greater than 1000")
	private int empSal;
	@Column(name = "empdesg")
	private String empDesg;
	@Column(name = "empdoj")
	@Pattern(regexp = "^\\d{4}-(0[1-9]|1[0-2])-(0[1-9]|1\\d|2\\d|3[01])$", message = "Date should be in yyyy-mm-dd pattern")
	private String dateOfJoining;
}
