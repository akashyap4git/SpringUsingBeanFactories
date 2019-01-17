package com.ibm.springcore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.FactoryBean;

public class CustomerFactory implements FactoryBean<CustomerFactoryBean> {
	
    private Logger logger = LoggerFactory.getLogger(CustomerFactory.class);
    
    private CustomerFactoryBean customerFactoryBean = new CustomerFactoryBean();
	
	public CustomerFactory() {
		logger.info("## -> -> -> -> CustomerFactory() <- <- <- <- ##");
	}
	
	public CustomerFactoryBean getObject() throws Exception {
		logger.info("## -> -> -> -> CustomerFactory getObject() <- <- <- <- ##");
		return this.customerFactoryBean;
	}
	
	public Class<?> getObjectType() {
		logger.info("## -> -> -> -> CustomerFactory getObjectType() <- <- <- <- ##");
		return CustomerFactoryBean.class;
	}
	
	public boolean isSingleton() {
		logger.info("## -> -> -> -> CustomerFactory isSingleton() <- <- <- <- ##");
		return false;
	}
}
