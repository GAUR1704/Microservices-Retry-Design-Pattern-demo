package com.prowings.demo_retry_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prowings.demo_retry_api.service.RetryAppService;



@RestController
public class RetryController {
	
	@Autowired
	RetryAppService appService; 
	
	@GetMapping("/consumeHello")
	public String consumeHello() {
		
		return appService.callHelloWorldGetHello();
		
	}

}
