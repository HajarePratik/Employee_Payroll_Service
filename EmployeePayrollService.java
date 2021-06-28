package com.employee_payroll_service;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeePayrollService {
	
	public enum IOService 
	{
		CONSOLE_IO, FILE_IO, DB_IO, REST_IO
	}
	
	public ArrayList<EmployeeDetails> employeedetails;

	public EmployeePayrollService(ArrayList<EmployeeDetails> employeedetails) {
		
		this.employeedetails = employeedetails;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Welcome to the Employee Payroll Service.");
		Scanner consoleInput = new Scanner(System.in);
		ArrayList<EmployeeDetails> employeePayrollList = new ArrayList<>();
		EmployeePayrollService empPayrollService = new EmployeePayrollService(employeePayrollList);
		empPayrollService.readEmployeePayrollData(consoleInput);
		empPayrollService.writeEmployeePayrollData();
	}

	private void readEmployeePayrollData(Scanner consoleInputReader)
	{
		System.out.println("Enter Employee Id: ");
		int id = consoleInputReader.nextInt();
		System.out.println("Enter Employee Name: ");
		String name = consoleInputReader.next();
		System.out.println("Enter Employee Salary: ");
		double salary = consoleInputReader.nextDouble();
		employeedetails.add(new EmployeeDetails(id, name, salary));
	}

	private void writeEmployeePayrollData() {
		System.out.println("\nWriting Employee Payroll Roaster to Console\n" + employeedetails);
	}

	
}
