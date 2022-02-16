package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@Autowired
	MyFeignClient client;

	@GetMapping("getEmp/{id}")
	public Employee getEmp(@PathVariable int id) {
		
		Employee emp=client.getEmp(id);
		
		emp.setName("hello "+emp.getName());
		
		return emp;
	}
	
}
