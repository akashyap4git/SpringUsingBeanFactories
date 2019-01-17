package com.ibm.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:application-context.xml")
public class SpringCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreApplication.class, args);
		ApplicationContext context = ApplicationContextProvider.getApplicationContext();
		
		Customer regularCust = context.getBean("regularCust", Customer.class);
		System.out.println(regularCust);
		
		Customer guestCust = context.getBean("guestCust", Customer.class);
		System.out.println(guestCust);
		
		Customer adminCust = context.getBean("adminCust", Customer.class);
		System.out.println(adminCust);
	}
}