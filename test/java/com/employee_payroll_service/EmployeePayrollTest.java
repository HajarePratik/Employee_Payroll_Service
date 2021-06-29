package com.employee_payroll_service;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class EmployeePayrollTest {

	@Test
	public void givenThreeEmpData_whenWrittenToFile_shouldMatchEmpEntriesCount() {
		EmployeeDetails[] empsArray = { 
				new EmployeeDetails(1, "Jeff Bezos", 10000.0),
				new EmployeeDetails(2, "Bill Gates", 20000.0), 
				new EmployeeDetails(3, "Pratik Hajare", 30000.0) 
			};
		EmployeePayrollService empPayrollService = new EmployeePayrollService(Arrays.asList(empsArray));
		empPayrollService.writeEmployeePayrollData(EmployeePayrollService.IOService.FILE_IO);
		long entriesCount = empPayrollService.countEntries(EmployeePayrollService.IOService.FILE_IO);
		Assert.assertEquals(3, entriesCount);
	}
}
