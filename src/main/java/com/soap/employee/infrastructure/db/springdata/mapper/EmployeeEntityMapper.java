package com.soap.employee.infrastructure.db.springdata.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.soap.employee.infrastructure.db.springdata.dbo.EmployeeEntity;

import io.spring.guides.gs_producing_web_service.Employee;


@Mapper(componentModel = "spring")
public interface EmployeeEntityMapper {
	

	@Mapping(target = "birthday", dateFormat = "yyyy-MM-dd")
	@Mapping(target = "dateOfBonding", dateFormat = "yyyy-MM-dd")
	 EmployeeEntity toDbo(Employee employee);

}
