package com.softronix.service;

import com.softrnoix.entity.Employee;

public interface EmployeeService {
	
	public String addEmployee(Employee emp);
	public Employee searchEmployee(String eid);
	public String updateEmployee(Employee emp);
	public String deleteEmployee(String eid);

	
}
