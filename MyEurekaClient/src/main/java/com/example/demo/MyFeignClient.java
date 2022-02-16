package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("myeurekajpa")
public interface MyFeignClient {

	@GetMapping("getEmp/{id}")
	public Employee getEmp(@PathVariable int id);
	
}
