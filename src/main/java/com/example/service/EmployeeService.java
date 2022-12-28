package com.example.service;

import com.example.entity.Employee;

public interface EmployeeService {
	
    public Employee saveEmployee(Employee entity);
	
	public Employee getEmployeeById(String Id);
	
	public boolean updateEmployee(Employee entity, String Id);
	
	public boolean deleteEmployeeById(String Id);
}
