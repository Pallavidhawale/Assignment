package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController 
{
	@Autowired
	private MyService service;
	@GetMapping("/done")
    public String greeting(){
        return "Welcome to my web";
	}
        @GetMapping("/service")
        public String helloService(){
            return service.sayHello();
    }
	
}
