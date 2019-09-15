package com.vino.spring_bean_lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Person implements DisposableBean, InitializingBean {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	Person() {
		System.out.println("1. Constructor Called :: Bean Created");
	}

	@PostConstruct
	public void postConstructTest() throws Exception {
		System.out.println("3. @PostConstruct Called");
	}

	// Bean initialization code
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("4. afterPropertiesSet() from InitializingBean Called");
	}

	public void initIt() throws Exception {
		System.out.println("5. initIt()[init] method from XML Called");
	}

	@PreDestroy
	public void preDestroyTest() throws Exception {
		System.out.println("7. @PreDestroy Called");
	}

	// Bean destruction code
	@Override
	public void destroy() throws Exception {
		System.out.println("8. destroy() from DisposableBean Called");
	}

	public void cleanUp() throws Exception {
		System.out.println("9. cleanUp()[destroy] method from XML Called");
	}

	protected void finalize() throws Throwable {
		System.out.println("finalize() called");
	}
}