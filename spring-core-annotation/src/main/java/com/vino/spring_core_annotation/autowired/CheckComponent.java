package com.vino.spring_core_annotation.autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CheckComponent {
	@Value("${test}")
	int testValue;

	public CheckComponent() {
		System.out.println(this.getClass().getName() + " Created " + testValue);
	}
}
