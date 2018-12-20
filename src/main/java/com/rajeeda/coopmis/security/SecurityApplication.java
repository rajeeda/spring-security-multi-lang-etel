package com.rajeeda.coopmis.security;

import com.rajeeda.coopmis.security.controller.TestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SecurityApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SecurityApplication.class, args);
		applicationContext.getBean(TestController.class).testStrings();



	}

}

