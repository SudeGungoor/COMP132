package app;

//DivideByZeroWithExceptionHandling.java
//Handling ArithmeticExceptions.

import java.util.Scanner;

public class DivideByZeroWithExceptionHandling
{
	// demonstrates throwing an exception when a divide-by-zero occurs
	public static int quotient(int numerator, int denominator) throws ArithmeticException {
		return numerator / denominator; // possible division by zero
	} 

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); 

		try { // read two numbers and calculate quotient                 
			System.out.print("Please enter an integer numerator: ");    
			int numerator = scanner.nextInt();                            

			System.out.print("Please enter an integer denominator: ");  
			int denominator = scanner.nextInt();                          

			int result = quotient(numerator, denominator);              
			System.out.printf("%nResult: %d / %d = %d%n", numerator, denominator, result);    			

		}                                          
		catch (ArithmeticException arithmeticException) {              
			System.out.printf("%nException: %s%n", arithmeticException);
			System.out.printf("Zero is an invalid denominator. %n%n");   
		}      

	} 

} 