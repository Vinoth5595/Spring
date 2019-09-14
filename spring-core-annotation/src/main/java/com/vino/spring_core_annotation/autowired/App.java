package com.vino.spring_core_annotation.autowired;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vino.spring_core_annotation.AppConfig;

/**
 * @author Vinoth
 * @version 1.0
 */
public class App {
	public static void main(String[] args) {
		/*
		 * @Component VS @Bean
		 * 
		 * @Component Preferable for component scanning and automatic wiring.

			When should you use @Bean?
			
			Sometimes automatic configuration is not an option. When? 
			Let's imagine that you want to wire components from 3rd-party libraries (you don't have the source code so you 
			can't annotate its classes with @Component), so automatic configuration is not possible.
			
			The @Bean annotation returns an object that spring should register as bean in application context. T
			he body of the method bears the logic responsible for creating the instance.
		 * 
		 * #######################################################################################################################
		 * 
		 * In Spring, bean scope is used to decide which type of bean instance should be
		 * return from Spring container back to the caller.
		 * 
		 * 5 types of bean scopes supported :
		 * 
		 * 1. singleton – Return a single bean instance per Spring IoC container 
		 * 2. prototype – Return a new bean instance each time when requested 
		 * 3. request – Return a ingle bean instance per HTTP request. * 
		 * 4. session – Return a single bean instance per HTTP session. * 
		 * 5. globalSession – Return a single bean instance per global HTTP session. *
		 * 
		 * #######################################################################################################################
		 * 
		 * @Profile annotation – we are mapping the bean to that particular profile (Example: DEV, UAT, DR, PROD).
		 * 
		 * #######################################################################################################################
		 * 
		 * @Import - We can use specific @Configuration classes without component scanning with this annotation.
		 * #######################################################################################################################
		 * @ImportResource - We can import XML configurations with this annotation. We can specify the XML file locations with the 
		 * locations argument, or with its alias.
		 * #######################################################################################################################
		 * @PropertySource -  define property files for application settings
		 * 
			@Configuration
			@PropertySource("classpath:/annotations.properties")
			class VehicleFactoryConfig {}
		 * #######################################################################################################################
		 * @PropertySources - We can use this annotation to specify multiple @PropertySource configurations
		 * 
		 	@Configuration
			@PropertySources({ 
			    @PropertySource("classpath:/annotations.properties"),
			    @PropertySource("classpath:/vehicle-factory.properties")
			})
			class VehicleFactoryConfig {}
			
			#######################################################################################################################
			How are beans named by default when created with annotation?
			
			If the annotation's value doesn't indicate a bean name, an appropriate name will be built based on the short name 
			of the class (with the first letter lower-cased). 
			For example:

			com.xyz.FooServiceImpl -> fooServiceImpl
		 */

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		/*
		 * The below code snippet is used to scan the package and beans created for
		 * Classes annotated with @Component
		 */
		// applicationContext.scan("com.vino.spring_core_annotation.autowired");
		Car car = applicationContext.getBean(Car.class);
		car.startCar();
		// applicationContext.refresh();

		// CheckComponent checkComponent =
		// applicationContext.getBean(CheckComponent.class);
		
	
	}
}
