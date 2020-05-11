package com.api.authjwt.dtos;

import java.io.Serializable;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

public class EmployeeDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotBlank
	private String firstNam;
	@NotBlank
	private String lastName;
	@NotBlank
	private String function;
	@Positive
	@Min(value = 100)
	private double salary;
	
	public EmployeeDTO() {
		
	}

	public String getFirstNam() {
		return firstNam;
	}

	public void setFirstNam(String firstNam) {
		this.firstNam = firstNam;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
