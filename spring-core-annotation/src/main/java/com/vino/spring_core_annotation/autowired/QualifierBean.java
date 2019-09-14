package com.vino.spring_core_annotation.autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;

@Scope("prototype")
public class QualifierBean {
	@Value("105")
	private int value;

	public QualifierBean() {
		System.out.println(this.getClass().getName() + " Created "+this.hashCode());
	}

	public void display() {
		System.out.println("@Qualifier & @Value working "+value);
	}
}
