package com.ericsson.response;

import com.ericsson.model.Address;
import com.ericsson.model.CompanyDetails;
import com.ericsson.model.Employee;
import com.ericsson.model.State;

public class ResponseFactory {
	
	public static ResponseObject getDetails(String serviceType){
		if(serviceType.equalsIgnoreCase("Employee")){
			return new Employee(1, "Raj Kumar", "Pauchauri");
		}
		else if(serviceType.equalsIgnoreCase("state")){
			return new State(1, "Uttrakhand", 13);
		}else if(serviceType.equalsIgnoreCase("company")){
			Address address = new Address("Ploat No A8A", "Knowledge Boulevard Sector -62", "Ericsson Park", "Noida", "Uttar Pradesh", "India", 201014);
			return new CompanyDetails(100, "Ericsson GLobal Services Pvt Ltd", address);
		}else{
			return null;
		}		
		
	}

}
