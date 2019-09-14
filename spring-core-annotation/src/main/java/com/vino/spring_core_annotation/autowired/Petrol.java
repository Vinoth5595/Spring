package com.vino.spring_core_annotation.autowired;

import org.springframework.stereotype.Component;

@Component
public class Petrol {

	public void checkPetrol() {
		System.out.println("Fuel is Full");
	}
}
