package com.vino.spring_bean_lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
 
public class CustomBeanPostProcessor implements BeanPostProcessor
{
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException
    {
        System.out.println("2. postProcessBeforeInitialization() from BeanPostProcessor Called. Bean Name :" + beanName);
        return bean;
    }
     
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException
    {
        System.out.println("6. postProcessAfterInitialization() from BeanPostProcessor Called. Bean Name :" + beanName);
        return bean;
    }
}
