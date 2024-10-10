package com.springmvc.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springmvc/stereotype/stereotypeconfig.xml");
		
		Student student = context.getBean("student", Student.class);
		
		Student student2 = context.getBean("student", Student.class);
		
		
		System.out.println(student.hashCode());
		System.out.println(student.getAddresses());
		System.out.println(student2.hashCode());
	}

}
