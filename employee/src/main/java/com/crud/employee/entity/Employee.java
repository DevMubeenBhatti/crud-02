package com.crud.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Employee {

	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;

	@Column(name = "name")
	private String empName;

	public void setempId(int empId) {
		this.empId = empId;
	}

	public int getempId() {
		return this.empId;
	}

	public void setempName(String empName) {
		this.empName = empName;
	}

	public String getempName() {
		return this.empName;
	}
}
