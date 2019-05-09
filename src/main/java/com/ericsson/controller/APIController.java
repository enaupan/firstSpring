package com.ericsson.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ericsson.model.Employee;
import com.ericsson.response.ResponceData;
import com.ericsson.response.ResponseFactory;

@RestController
public class APIController {
	
	final static Logger logger = Logger.getLogger(APIController.class);
	
	@RequestMapping(value = "/restTest", method = RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody ResponseEntity<Object> getTestData() 
	{
		try { 
			List<Employee> empArray= new ArrayList<Employee>();
			System.out.println("Inside test data..");
			Employee emp1 = new Employee();
			emp1.setId(1);
			emp1.setFname("Pankaj");
			emp1.setLname("Nautiyal");
			
			Employee emp2 = new Employee();
			emp2.setId(2);
			emp2.setFname("Mohit");
			emp2.setLname("Kumar Mishra");
			
			empArray.add(emp1);
			empArray.add(emp2);
			ResponseEntity<Object> entity = new ResponseEntity<Object>(empArray,
					HttpStatus.OK);
			return entity;
		} catch (Exception ex) {
			return new ResponseEntity<Object>(ex.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
	
	
	@RequestMapping(value = "/responseDetail", method = RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody ResponseEntity<Object> getResponse(@RequestParam(value = "serviceType", required = true) String serviceType) 
	{
		try { 
			logger.info("ServiceType :: "+serviceType); 
			
			ResponceData resData= new ResponceData(200, "Success");
			resData.setResponceObject(ResponseFactory.getDetails(serviceType));
			ResponseEntity<Object> responseEntity = new ResponseEntity<Object>(resData,
					HttpStatus.OK);
			return responseEntity;
		} catch (Exception ex) {
			return new ResponseEntity<Object>(ex.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}

}
