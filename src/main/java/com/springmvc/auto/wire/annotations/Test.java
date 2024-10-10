package com.springmvc.auto.wire.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springmvc/auto/wire/annotations/autoconfig.xml");
		
		Employee emp = (Employee) context.getBean("emp");
		
		System.out.println(emp);
		
	}

}
