package com.soap.employee.infrastructure.db.springdata.repository;


import org.springframework.stereotype.Service;
import com.soap.employee.domain.repository.EmployeeRepositoy;
import com.soap.employee.infrastructure.db.springdata.mapper.EmployeeEntityMapper;
import com.soap.employee.infrastructure.db.springdata.mapper.EmployeeEntityMapperImpl;

import io.spring.guides.gs_producing_web_service.Employee;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Service

public class EmployeeDboRepository implements EmployeeRepositoy {
	
	
	
	  private final SpringDataEmployeeRepository springDataEmployeeRepository;
	  
	  private final EmployeeEntityMapperImpl employeeEntityMapper = new EmployeeEntityMapperImpl();
	
	  
	@Override
	public void save(Employee employee) {
		
		springDataEmployeeRepository.save(employeeEntityMapper.toDbo(employee));
	

		
	}

}
