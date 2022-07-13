// Collections example: List interface. ArrayList, LinkedList, their comparison. 
// A List (sometimes called a sequence) is an ordered Collection that can contain duplicate elements. 

package list_examples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
	
		//ArrayList<Integer> numbers = new ArrayList<Integer>();
		// or (using List interface)
		List<Integer> numbers = new ArrayList<Integer>();
		
		// add: adding elements to ArrayList numbers
		numbers.add(100);
		numbers.add(200);
		numbers.add(300);
		numbers.add(400);
	
		// get: retrieving element
		// size: number of elements

		// indexed loop iteration
		System.out.println("Iteration 1");
		for (int i = 0; i < numbers.size(); i++)
				System.out.println(numbers.get(i));
		
		// remove: removing element
		numbers.remove(numbers.size() - 1); // remove the last element

		// numbers.remove(0); // remove first element, but very slow.

		// another way of iterating elements, for-each loop
		System.out.println("Iteration 2");
		for (Integer curnum : numbers)
				System.out.println(curnum);
		
		// (for other methods available for List: https://docs.oracle.com/javase/8/docs/api/java/util/List.html)
		//////////////////////////////////////////////////////////////////////////////////////////
				
		
		List<Integer> myarrayList = new ArrayList<Integer>();
		
		List<Integer> mylinkedList = new LinkedList<Integer>();
	
		// polymorphic behavior
		// compare ArrayList and LinkedList performance 
		
		compareTimes("my Array List", myarrayList);
		compareTimes("my Linked List", mylinkedList);
		
	} // end of main
	

	// using List interface as the argument (enables polymorphic behavior)
	private static void compareTimes(String type, List<Integer> myList) {

			// add 10^4 items to the end of list
			for (int k = 0; k < 1E4; k++){
				myList.add(k); 
				//System.out.println("item " + (k+1) + " added to the list");
			}
			// get current time in milliseconds
			long starttime = System.currentTimeMillis();

			// add items elsewhere in the list, at the beginning or middle 
			// (prefer LinkedList, it's faster!)
			for (int k = 0; k < 1E5; k++)
				// myList.add(0,k); // at the beginning
				myList.add(200, k); // at middle, index 200
				
			// get current time in milliseconds
			long endtime = System.currentTimeMillis();

			System.out.println("For " + type + ", it takes time of " + (endtime - starttime) + " ms");
		}
} // end of Test
