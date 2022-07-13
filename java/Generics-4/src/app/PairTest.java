package app;

import java.util.ArrayList;

// Generic Pair class testing program.

public class PairTest {
	public static void main(String[] args) {

		// create pair of integer and string
		Pair<Integer, String> pair1 = new Pair<Integer, String>(2021, "Year");

		// display original pair1
		System.out.printf("Original pair: <%d, %s>\n", pair1.getFirst(), pair1.getSecond()); 

		// modify pair
		pair1.setFirst(2022);
		pair1.setSecond("Project");

		// display modified pair1
		System.out.printf("Modified pair: <%d, %s>\n", pair1.getFirst(), pair1.getSecond());
		
		// create pair of string and boolean
		Pair<String, Boolean> pair2 = new Pair<>("New Year", true);

		// display original pair2
		System.out.printf("Original pair: <%s, %b>\n", pair2.getFirst(), pair2.getSecond()); 
		
	} 

	// Exercise: 
	// Implement a generic method (changePair) that modifies the first and second elements of a pair
	// Test the generic method 
	// Question: generic method header ?
	
    //	public static 
	
}


