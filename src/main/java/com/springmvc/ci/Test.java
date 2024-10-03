package com.springmvc.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springmvc/ci/ciconfig.xml");
		
		A obj = (A) context.getBean("a");
		
		obj.sum();
		
	}

}
