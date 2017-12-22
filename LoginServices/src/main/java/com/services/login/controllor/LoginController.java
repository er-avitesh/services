package com.services.login.controllor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

	@RequestMapping(value = "/HealthCheck")
	public void testApp() {
		System.out.println("All is Well");
	}
	
	
}
