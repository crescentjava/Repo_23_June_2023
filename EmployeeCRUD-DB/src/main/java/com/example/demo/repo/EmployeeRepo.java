package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	
	List<Employee> findByName(String name);

}
