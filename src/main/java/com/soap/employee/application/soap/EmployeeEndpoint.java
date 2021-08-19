package com.soap.employee.application.soap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.soap.employee.domain.service.EmployeeService;

import io.spring.guides.gs_producing_web_service.SetEmployeeRequest;
import io.spring.guides.gs_producing_web_service.SetEmployeeResponse;

@Endpoint
public class EmployeeEndpoint {
	
	private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";
	
	private EmployeeService employeeService;
	
	@Autowired
    public EmployeeEndpoint( EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
	
	
	 @PayloadRoot(namespace = NAMESPACE_URI, localPart = "setEmployeeRequest")
	    @ResponsePayload
	    public SetEmployeeResponse getCountry(@RequestPayload SetEmployeeRequest request) {
		 
		 employeeService.saveEmployee(request.getEmployee());
		 

	        SetEmployeeResponse response=new SetEmployeeResponse();
			return response;
	    }

}
