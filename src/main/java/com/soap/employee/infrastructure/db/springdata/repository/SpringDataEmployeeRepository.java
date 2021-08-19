package com.soap.employee.infrastructure.db.springdata.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.soap.employee.infrastructure.db.springdata.dbo.EmployeeEntity;


@Repository
public interface SpringDataEmployeeRepository  extends JpaRepository<EmployeeEntity, Integer> {
	

}
