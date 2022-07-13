// Class Collections of Java provides several high-performance algorithms for manipulating collection elements.
// Example algorithms:  
// sort, binarySearch, reverse, shuffle, min, max, fill, addAll, frequency

package algorithm_examples;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<String> countries = new LinkedList<String>();

		countries.add("turkey");
		countries.add("taiwan");
		countries.add("egypt");
		countries.add("jordan");
		countries.add("usa");
		countries.add("japan");
		countries.add("singapore");
		countries.add("australia");
		
		System.out.println("created list:\n" + countries);
		
		// Method sort: sorts the elements of a List in ascending order
		Collections.sort(countries);
		System.out.println("sorted list:\n" + countries);
	
		
		// Method binarySearch: searches for an object in a sorted List. 
		// if found, returns its location, otherwise returns negative 
		int index = Collections.binarySearch(countries, "turkey");
		
		if (index < 0) 
			System.out.println("not found in the list");
		else
			System.out.println("Element " + countries.get(index) + " found!");
		
		// Method reverse: reverses the order of the elements in a List
		Collections.reverse(countries);
		System.out.println("reversed list:\n" + countries);
		
		// Method shuffle: randomly orders a list’s elements.
		Collections.shuffle(countries);
		System.out.println("shuffled list:\n" + countries);
		
		// Method min: returns the smallest element in a Collection
		String first = Collections.min(countries);
		System.out.println("The first in the list of countries: " + first);

		// Method max: returns the largest element in a Collection
		String last = Collections.max(countries);
		System.out.println("The last in the list of countries: " + last);
		
		// ////////////////////////////////
		// Methods fill, addAll, frequency
		
		List<String> test = new LinkedList<String>(countries);
		
		// Method fill: replaces all of the elements of the specified List with the specified element.
		Collections.fill(test, "turkey");
		System.out.println("fill test: \n" + test);
		
		// Method addAll: takes two arguments
		// a Collection into which to insert the new element(s) and 
		// an array that provides elements to be inserted. 
		String[] array = {"italy",  "germany", "spain"}; 
		Collections.addAll(test, array);
		
		System.out.println("addAll test: \n" + test);
		
		// Method frequency: takes two arguments
		// a Collection to be searched and 
		// an Object to be searched for in the collection. 
		// it  returns the number of times that 
		// the second argument appears in the collection. 

		int count = Collections.frequency(test, "turkey");
		System.out.println("frequency count: " + count);
		
		// all methods available for Collections class: 
		// https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html
		
	}

}
