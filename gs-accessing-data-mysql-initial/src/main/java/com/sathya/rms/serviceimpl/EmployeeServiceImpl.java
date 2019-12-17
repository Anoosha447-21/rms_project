package com.sathya.rms.serviceimpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.data.EmployeeRepository;
import com.sathya.rms.entities.Employee;
import com.sathya.rms.services.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
	EmployeeRepository employeerepository;
	@Override
	@Transactional
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return  employeerepository.save(employee);
	}
	@Transactional
	@Override
	public Iterable<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeerepository.findAll();
	}
    @Transactional
	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return  employeerepository.save(employee);
	}
    @Transactional
	@Override
	public void deleteEmployee(Integer id) {
		// TODO Auto-generated method stub
		  employeerepository.deleteById(id);
	}

}
