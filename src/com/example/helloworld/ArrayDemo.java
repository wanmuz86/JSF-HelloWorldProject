package com.example.helloworld;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5};
		
		// Accessing / retrieving items from an array
		
		System.out.println("First element "+numbers[0]);
		
		// Modifying array elements
	
		numbers[0] = 10;
		System.out.println("Modified first element "+numbers[0]);
		
		// How many items in an array?
		System.out.println("Array length: "+numbers.length);
		
		//Iterating items in the array
		
		// 1st way
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		// 2nd way
		// For every item (number) in array (numbers)
		for (int number: numbers) {
			System.out.println(number);
		}
	
	}

}
