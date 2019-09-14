package com.vino.spring_core_annotation.autowired;

import org.springframework.stereotype.Component;

@Component
public class Key {

	public void unlockCar() {
		System.out.println("Car unlocked");
	}
}
