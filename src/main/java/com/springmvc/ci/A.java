package com.springmvc.ci;

public class A {
	
	private int a;
	private int b;
	
	public A(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	public void sum() {
		System.out.println("Addition is - " + (a+b));
	}

}
