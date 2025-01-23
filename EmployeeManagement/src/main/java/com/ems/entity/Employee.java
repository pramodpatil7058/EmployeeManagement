package com.ems.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="employees")
public class Employee {
	@Id
	private int empId;
	private String empName;
	private String empDesg;
	private Date dateOfJoining;
	}
