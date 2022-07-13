package app;

import java.util.ArrayList;
import java.util.List;

public class WildcardQuestion {

	public static void main(String[] args) {

		Integer[] integers = {1, 2, 3, 4, 5};

		List<Integer> integerList = new ArrayList<>();

		// insert elements in integerList
		for (Integer item : integers) {
			integerList.add(item);
		}

//		printList(integerList);

		//////////////////////////////////////////////////////////////////
		Double[] doubles = {1.1, 3.3, 5.5};
		List<Double> doubleList = new ArrayList<>();

		// insert elements in doubleList
		for (Double element : doubles) {
			doubleList.add(element);
		}

//		printList(doubleList);

		//////////////////////////////////////////////////////////////////

		String[] words = {"Best", "wishes", "for", "the", "new", "year"}; 
		List<String> wordList = new ArrayList<>();

		// insert elements 
		for (String element : words) {
			wordList.add(element);
		}

//		printList(wordList);

	}


	// Question: implement a method (printList) 
	// that prints the elements of a generic List using wildcard-type argument
	
	// method header ?
	// implementation: one line only ?
	
//	public static ... {

//

//	}

}
