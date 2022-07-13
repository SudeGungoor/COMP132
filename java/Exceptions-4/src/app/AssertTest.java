package app;

//AssertTest.java

//Checking with assert that a number is not equal to a certain value
//Checking with assert that a number is within range

import java.util.Scanner;

public class AssertTest {
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number between 0 and 10: ");
		int number = input.nextInt();

		// Example: assert that the value is not 9
		assert (number != 9);
		
		// Example: assert that the value is >= 0 and <= 10
		assert (number >= 0 && number <= 10) : "bad number: " + number;

		System.out.printf("You entered %d%n", number);
	} 
} 