package com.employee_payroll_service;

import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeePayrollService {
	
	public enum IOService 
	{
		CONSOLE_IO, FILE_IO, DB_IO, REST_IO
	}
	
	private List<EmployeeDetails> employeedetails;

	public EmployeePayrollService(List<EmployeeDetails> empPayrollList) {
		this.employeedetails = empPayrollList;
	}

	public static void main(String[] args) 
	{
		System.out.println("Welcome to the Employee Payroll Service.");
		Scanner consoleInput = new Scanner(System.in);
		ArrayList<EmployeeDetails> employeePayrollList = new ArrayList<>();
		EmployeePayrollService empPayrollService = new EmployeePayrollService(employeePayrollList);
		empPayrollService.readEmployeePayrollData(consoleInput);
		empPayrollService.writeToConsole();
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

	private void writeToConsole() {
		System.out.println("\nWriting emp payroll roaster to console\n" + employeedetails);
	}
	
	// write to file using File IO
	public void writeEmployeePayrollData(IOService ioService) 
	{
			if (ioService.equals(IOService.FILE_IO)) {
				new EmployeePayrollFileIOService().writeData(employeedetails);
			}
	}
	// count the entries
	public long countEntries(IOService ioService) 
	{
			if (ioService.equals(IOService.FILE_IO))
				return new EmployeePayrollFileIOService().countEntries();
			return 0;
	}

	
}
