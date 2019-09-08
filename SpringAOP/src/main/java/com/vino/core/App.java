package com.vino.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vino.customer.bo.CustomerBo;

public class App {
	public static void main(String[] args) throws Exception {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("Spring-Customer.xml");

		CustomerBo customer = (CustomerBo) appContext.getBean("customerBean");
		System.out.println("#######################################");
		customer.addCustomer();
		System.out.println("#######################################");
		customer.addCustomerReturnValue();
		System.out.println("#######################################");
		customer.addCustomerAround("mkyong");
		System.out.println("#######################################");
		customer.addCustomerThrowException();
		System.out.println("#######################################");
	}
}