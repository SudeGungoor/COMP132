// Sorting primitive type Lists using Comparator interface, compare() method
// Collections sort algorithm

package comparator_examples;

import java.util.Collections;
import java.util.Comparator;
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
		System.out.println("\nsorted list:\n" + countries);
		
		// sorting primitive type Lists using Comparator interface, compare() method

		// The sort method call may specify second arg as a Comparator object
		// that defines an alternative ordering

		// Example-1: sorting elements based on their string length in ascending order
		
		Collections.sort(countries, new myComparator());
		System.out.println("\nsorted list by string length:\n" + countries);

		// Example-2: sorting elements based on their second chars in ascending order
		
		Collections.sort(countries, new mySecondComparator());
		System.out.println("\nsorted list by second chars:\n" + countries);
		
		
	}

} // end of Test class

//myComparator class implements Comparator interface, compare() method

class myComparator implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {

		// longer string should be later in the sorted list, return 1
		if (s1.length() > s2.length()) return 1;
		
		if (s1.length() < s2.length()) return -1;
		
		return 0;

	}
}

//mySecondComparator class implements Comparator interface, compare() method

class mySecondComparator implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {

		// comparing by second characters in ascending order
		if (s1.charAt(1) > s2.charAt(1)) return 1;
		
		if (s1.charAt(1) < s2.charAt(1)) return -1;

		return 0;

	}
	
}


