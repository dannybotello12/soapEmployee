package com.soap.employee.infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.soap.employee.domain.service.EmployeeService;
import com.soap.employee.domain.service.EmployeeServiceImpl;
import com.soap.employee.domain.repository.EmployeeRepositoy;

@Configuration
public class BeanConfiguration {
	
	
	@Bean
    EmployeeService employeeService(EmployeeRepositoy employeeRepository) {
        return new EmployeeServiceImpl(employeeRepository);
    }

}
