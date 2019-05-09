package com.ericsson.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class DefaultController {

	@RequestMapping(value="/hello")
	public void hello(){
		System.out.println("Hello World.....");
	}
	@RequestMapping("/test")  
    public String display()  
    {  
        return "test";  
    }   
}
