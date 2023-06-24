package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl {
	
	
	@Autowired
	EmployeeRepo employeeRepo;
	
	
	public List<Employee> getAllEmployeeDetails()
	{
		return employeeRepo.findAll();
	}
	
	public void saveEmpRecord(Employee employee)
	{
		employeeRepo.save(employee);
	}
	
	public List<Employee> findByName(String name)
	{
		return employeeRepo.findByName(name);
	}

}
