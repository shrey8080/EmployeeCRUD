package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Employee;
import com.example.service.EmployeeService;

@RestController
@RequestMapping("/Employee")
public class MyRestController {
	
	@Autowired
	EmployeeService service;
	
	@PostMapping
	public ResponseEntity<?> save(@RequestBody Employee entity){
		return ResponseEntity.ok(service.saveEmployee(entity));
	}
	
	@GetMapping("/{Id}")
	public ResponseEntity<?> getById(@PathVariable("Id")String Id){
		
		return ResponseEntity.ok(service.getEmployeeById(Id));
	}
	
	
	@PutMapping("/{Id}")
	public ResponseEntity<?> update(@RequestBody Employee entity, @PathVariable("Id") String Id){
		if(service.updateEmployee(entity, Id))
			return ResponseEntity.ok("Employee details updated in database Successfully!!!");
		else
			return ResponseEntity.ok("Failed to update Employee Details into database!!!");
	}
	
	@DeleteMapping("{Id}")
	public ResponseEntity<?> delete(@PathVariable("Id") String Id){
		
		if(service.deleteEmployeeById(Id))
			return ResponseEntity.ok("Employee details deleted Successfully!!!");
		else
			return ResponseEntity.ok("Failed to remove Employee details!!!");
	}
}
