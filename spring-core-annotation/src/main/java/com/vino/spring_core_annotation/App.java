package com.vino.spring_core_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Vinoth
 * @version 1.0
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		Windows windows = applicationContext.getBean(Windows.class);
		windows.isWorking();
		
		
		
	}
}
