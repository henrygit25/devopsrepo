package com.devops.java.basic;

public class HelloWorld {
	
	
	public HelloWorld() {
		System.out.println("Hello world");
		System.out.println("GIT in eclipse"); 
	}
	
	public static int add(int a, int b) {
	    int output = a+b;
		return output
		
	}

	public static void main(String[] args) {
		//HelloWorld helloworld = new HelloWorld();
		System.out.println("Add Output:" + add(5,5));

	}

}
