package com.ericsson.model;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.ericsson.scopeTest.RequestManager;
@SuppressWarnings("deprecation")
public class Test {

	 public static void main(String[] args) {  
         
	        Resource r=new ClassPathResource("applicationContext.xml");  
	        BeanFactory factory=new XmlBeanFactory(r);  
	          
	        Employee emp1=(Employee)factory.getBean("e");
	        System.out.println(emp1.toString());


	        Employee emp2=(Employee)factory.getBean("e");
	        emp2.setId(9);
	        emp2.setFname("fName");
	        emp2.setLname("lName");
	        System.out.println(emp2.toString());
	        
	        Employee emp3=(Employee)factory.getBean("e2");  
	        System.out.println(emp3.toString());
	        
	        Employee emp4=(Employee)factory.getBean("e2");  
	        emp4.setId(99);
	        emp4.setFname("fName9");
	        emp4.setLname("lName9");
	        System.out.println(emp4.toString());
	        
	        System.out.println("\n\n");
	        
	        RequestManager bean = (RequestManager) factory.getBean("requestManager");
	        bean.handleRequest();
	        bean.handleRequest();
	        bean.handleRequest();
	        
	    }
}
