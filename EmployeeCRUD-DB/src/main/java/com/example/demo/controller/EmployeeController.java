package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeServiceImpl;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeServiceImpl empService;
	
	
	@GetMapping("/getAll")
	public List<Employee> getAllEmpRecords()
	{
		return empService.getAllEmployeeDetails();
	}
	
	@PostMapping("/add")
	public void addEmpRecord(@RequestBody Employee employee)
	{
		empService.saveEmpRecord(employee);
	}
	
	@GetMapping("/findByName/{name}")
	public List<Employee> findByName(@PathVariable String name)
	{
		return empService.findByName(name);
	}

}
