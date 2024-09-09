package com.example.helloworld;

public class ControlFlowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = -10;
		
		if (num > 0) {
			System.out.println("Number is positiive");
		} else if ( num < 0) {
			System.out.println("Number is negative");
		}
		else {
			System.out.println("Number is zero");
		}
		
		// Example with logical operator &&, || or !
		
		int age = 16;
		
		
		if ( age <= 12) {
			System.out.println("You cannot watch the movie");
		} 
		else if ( age > 12 && age < 18) {
			System.out.println("You can watch the movie with parents");
		}
		else {
			System.out.println("You can watch the movie");
		}
		
		// example with multiple condition 
		
		boolean parent = false;
		
		if ( (age > 12 && age < 18 && parent == true) || (age >= 18)) {
			System.out.println("You can watch the movie");
		}
		else {
			System.out.println("You cannot watch the movie");
		}
		
		// Switch case
		
		int day = 3;
		
		switch(day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		default:
			System.out.println("Invalid day");
		}
		
		// while loop
		
		int i = 0;
		int count = 0;
		while (count < 5) { 
			if (i % 2 == 0) {
				System.out.println(i);
				count++;
			}
			i++; // 1
		}
		

		System.out.println("Do while example");
		// If it does not fulfill the criteria it will run the code at least once
		int j = 10;
		
		do {
			System.out.println(j);
			j++;
		} 
		while (j<=5);
		
		
		System.out.println("Break example");
		
		for (int k = 0; k <= 10; k++) {
			if (k == 5) {
				break;
			}
			System.out.println(k);
		}
		
		System.out.println("Continue example");
		
		for (int l =0; l <=10; l++) {
			if (l%2 == 0) { // even number
				continue;
			}
			System.out.println(l);
		}
	}

}
