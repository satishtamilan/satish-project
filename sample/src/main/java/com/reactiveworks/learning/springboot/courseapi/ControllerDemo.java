package com.reactiveworks.learning.springboot.courseapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@RestController
public class ControllerDemo {
	
 @Value("${BLUE_SERVICE_HOST}")
    private String BlueAppHost;
	
	@RequestMapping("/hello")
	public String getHello(){
		return "Hello";
	}
	
	@RequestMapping("/")
   public String greetMessage(){
	   return "WELCOME TO Blue Deployment Service Discovery"+ BlueAppHost;
   }
}
