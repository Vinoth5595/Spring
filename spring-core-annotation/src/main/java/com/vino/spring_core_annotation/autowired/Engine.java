package com.vino.spring_core_annotation.autowired;

import org.springframework.stereotype.Component;

@Component
public class Engine {

	public void startEngine() {
		System.out.println("Engine Started");
	}
}
