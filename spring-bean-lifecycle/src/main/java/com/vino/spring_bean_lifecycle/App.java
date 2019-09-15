package com.vino.spring_bean_lifecycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Vinoth
 * @version 1.0
 * @since 15.09.2019
 */
public class App 
{
    public static void main( String[] args )
    {
    	 // Reading configuration from the spring configuration file.
        ConfigurableApplicationContext   context = new ClassPathXmlApplicationContext("spring-config.xml");
        Person person = context.getBean("personBean", Person.class);
        System.out.println("\tData from Bean :: Name= " + person.getName());
        // Closing the context object.
        //Beans will not be destroyed if we comment the below.
        context.close();
    }
}
