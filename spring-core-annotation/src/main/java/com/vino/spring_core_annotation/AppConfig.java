package com.vino.spring_core_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.vino.spring_core_annotation.autowired.Car;
import com.vino.spring_core_annotation.autowired.Engine;
import com.vino.spring_core_annotation.autowired.Key;
import com.vino.spring_core_annotation.autowired.Petrol;
import com.vino.spring_core_annotation.autowired.QualifierBean;

@Configuration
@PropertySource("classpath:value.properties")

/*@Lazy
 * 
 * We use @Lazy when we want to initialize our bean lazily. 
 * By default, Spring creates all singleton beans eagerly at the startup/bootstrapping of the application context.

However, there are cases when we need to create a bean when we request it, not at application startup.

This annotation behaves differently depending on where we exactly place it. We can put it on:

1. a @Bean annotated bean factory method, to delay the method call (hence the bean creation)
2. a @Configuration class and all contained @Bean methods will be affected
3. a @Component class, which is not a @Configuration class, this bean will be initialized lazily
4. an @Autowired constructor, setter, or field, to load the dependency itself lazily (via proxy)
 
*/
public class AppConfig {

	// @Bean marks a factory method which instantiates a Spring bean -> this will
	// have default name.
	// @Bean("<<customised name>>")

	@Bean
	protected Windows getWindowBean() {
		return new Windows();
	}

	@Bean("engine")
	protected Engine getEngineBean() {
		return new Engine();
	}
	
	// Annotation - Starts here
	
	/*
	 * @DependsOn
	 * 
	 * We can use this annotation to make Spring initialize other beans before the annotated one. 
	 * Usually, this behavior is automatic, based on the explicit dependencies between beans.
	 * 
	 * We only need this annotation when the dependencies are implicit, for example, JDBC driver 
	 * loading or static variable initialization.
	 * 
	 */
	@Bean
	@DependsOn("engine")
	protected Car getCarBean() {
		return new Car();
	}


	@Bean
	protected Key getKeyBean() {
		return new Key();
	}

	@Bean
	protected Petrol getPetrolBean() {
		return new Petrol();
	}

	// Annotation - Ends here

	// Qualifier - Starts here

	@Bean("qualifier1")
	@Primary
	public QualifierBean getQualifierBean1() {
		return new QualifierBean();
	}

	@Bean("qualifier2")
	public QualifierBean getQualifierBean2() {
		return new QualifierBean();
	}

	// Qualifier - Ends here

	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfigIn() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}
