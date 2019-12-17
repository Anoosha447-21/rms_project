package com.sathya.rms.services;

import com.sathya.rms.entities.Employee;

public interface EmployeeService {
	

	public Employee addEmployee(Employee employee);

	public Iterable<Employee> getAllEmployees();

	public Employee updateEmployee(Employee employee);

	public void deleteEmployee(Integer id);
}
