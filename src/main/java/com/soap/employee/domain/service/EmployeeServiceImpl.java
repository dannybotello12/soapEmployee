package com.soap.employee.domain.service;

import com.soap.employee.domain.repository.EmployeeRepositoy;

import io.spring.guides.gs_producing_web_service.Employee;

public class EmployeeServiceImpl  implements EmployeeService {
	
	
	   private final EmployeeRepositoy employeeRepositoy;

	    public EmployeeServiceImpl(EmployeeRepositoy employeeRepositoy) {
	        this.employeeRepositoy = employeeRepositoy;
	    }

	@Override
	public void saveEmployee(Employee employee) {
	
	
		employeeRepositoy.save(employee);

	       
		
	}
	
	

}
