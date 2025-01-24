package com.ems.entity;

import jakarta.persistence.Column;
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
@Table(name = "employees")
public class Employee {
	@Id
	private int empId;
	@Column(name = "empname")
	private String empName;
	@Column(name = "empsal", nullable = false)
	private int empSal;
	@Column(name = "empdesg")
	private String empDesg;
	@Column(name = "empdoj")
	private String dateOfJoining;
}
