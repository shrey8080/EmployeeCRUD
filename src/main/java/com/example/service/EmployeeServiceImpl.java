package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.EmployeeDao;
import com.example.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeDao dao;



	@Override
	public Employee saveEmployee(Employee entity) {
		// TODO Auto-generated method stub
		return dao.save(entity);
	}

	@Override
	public Employee getEmployeeById(String Id) {
		// TODO Auto-generated method stub
		return dao.findById(Id).get();
	}

	@Override
	public boolean updateEmployee(Employee entity, String Id) {
		// TODO Auto-generated method stub
		Optional<Employee> opt = dao.findById(Id);
	    if (opt == null) {
			System.out.println("No Employee found with Id " + Id + " Employee Details");
			return false;
		} else {
			Employee fri = opt.get();
			fri.setFname(entity.getFname());
			fri.setLname(entity.getLname());
			fri.setEmail(entity.getEmail());
			fri.setAge(entity.getAge());
		    dao.save(fri);
			return true;
		}
	}

	@Override
	public boolean deleteEmployeeById(String Id) {
		// TODO Auto-generated method stub
		try {
			dao.deleteById(Id);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	
	}

}
