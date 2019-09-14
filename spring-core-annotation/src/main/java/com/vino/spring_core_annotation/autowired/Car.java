package com.vino.spring_core_annotation.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;

public class Car {
	// Autowired - Constructor Injection
	@Autowired
	Engine engine;

	Key key;

	// Autowired - Setter Injection
	@Autowired
	void setKey(Key key) {
		this.key = key;
	}

	// Autowired - Field Injection
	@Autowired
	Petrol petrol;

	@Autowired
	//@Qualifier("qualifier1")
	QualifierBean qbean;

	public void startCar() {
		petrol.checkPetrol();
		key.unlockCar();
		engine.startEngine();
		System.out.println("Car started");
		qbean.display();
	}
}
