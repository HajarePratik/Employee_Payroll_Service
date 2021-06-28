package com.employee_payroll_service;

public class EmployeeDetails {

	public int empId;
	public String empName;
	public double empSalary;
	
	public EmployeeDetails(int empId, String empName, double empSalary) 
	{
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	
}
