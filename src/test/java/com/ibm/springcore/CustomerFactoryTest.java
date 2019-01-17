package com.ibm.springcore;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:application-context.xml"})
public class CustomerFactoryTest implements ApplicationContextAware {
	
	@Autowired
	private ApplicationContext context;
	
	@Test
	public void testFactoryMethod() {
		Customer regularCust = context.getBean("regularCust", Customer.class);
		System.out.println(regularCust);
		
		Customer guestCust = context.getBean("guestCust", Customer.class);
		System.out.println(guestCust);
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context = applicationContext;
	}
}
