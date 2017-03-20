package com.cjy.spring.core;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathResource resource =new ClassPathResource("META-INF/spring/applicationContext.xml");
    	
    	DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
    	
    	
    	XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
    	
    	reader.loadBeanDefinitions(resource);
    	
    	System.out.println( "spring runing!" );
    	
    	TestInterface testInterface = (TestInterface) beanFactory.getBean("testAOP");
    	
    	testInterface.test();
    	
    }
}
