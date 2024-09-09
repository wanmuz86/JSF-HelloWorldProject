package com.example.helloworld;

public class StringOperationsDemo {

	public static void main(String[] args) {
		
		
		String greeting = "Hello";
		String name = "John";
		
		String message = greeting + ", " + name + "!";
		System.out.println(message);
		
		System.out.println("Length of the string is "+message.length());
		
		System.out.println("Character at index 1 "+message.charAt(1) );
		
		// From 7 until 11 but excluding 11 
		String subMessage = message.substring(7,11); //Extract John 
		System.out.println("Substring " +subMessage);
		

	}

}
