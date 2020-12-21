package com.lti;

public class Calci {

	public static int add(int a , int b) {
		return a + b;
	}
	
	public static int subs(int a , int b) {
		return a - b;
	}
	
	public static int prod(int a , int b) {
		return a * b;
	}
	
	public static void main(String args[]) {
		System.out.println("Sum = " + add(10 , 20));
		System.out.println("diff = " + subs(20,10));
		System.out.println("product = " + prod(20,10));
	}
}
