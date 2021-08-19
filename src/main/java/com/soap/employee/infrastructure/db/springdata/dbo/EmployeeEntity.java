package com.soap.employee.infrastructure.db.springdata.dbo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Data;


@Data @Entity @Table(name = "Employee", uniqueConstraints = { @UniqueConstraint(columnNames = {"idEmployee"})}) 
public class EmployeeEntity  implements Serializable {
	

	private static final long serialVersionUID = 5714260968365557458L;

	@Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    
	private Integer idEmployee;

    private String names;

    private String surnames;
    
    private String typeDocument;
    
    private String numberDocument;
    
    private Date birthday;
    
    private Date dateOfBonding;
    
    private String position;
    
    private Double salary; 
    
    
}
