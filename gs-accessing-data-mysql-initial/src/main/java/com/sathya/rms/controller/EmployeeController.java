package com.sathya.rms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.rms.entities.Employee;
import com.sathya.rms.services.EmployeeService;




@RestController
@RequestMapping(path="/employee")
public class EmployeeController {
	@Autowired
	EmployeeService employeeservice;
	@PostMapping(path="/addEmployee")
	public Employee addEmployee(@RequestBody Employee employee) {
		// TODO Auto-generated method stub
		return  employeeservice.addEmployee(employee);
	}
	@GetMapping(path="/getAll")
	public Iterable<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeservice.getAllEmployees();
	}
	@PutMapping(path="/updateEmployee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		// TODO Auto-generated method stub
		return  employeeservice.updateEmployee(employee);
	}
   
	@DeleteMapping(path="/deleteEmployee/{id}")
	public void deleteEmployee(@PathVariable("id") Integer id) {
		// TODO Auto-generated method stub
    	employeeservice.deleteEmployee(id);
	}

}
