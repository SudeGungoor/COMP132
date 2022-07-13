// Using iterators (Iterator interface of Java Collections Framework) to iterate over collection elements
// Comparison with modern iteration syntax

package iterator_examples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		
		// ------------------------------------------------------------------------
		// List iteration examples ------------------------------------------------
		// ------------------------------------------------------------------------
		LinkedList<String> colors = new LinkedList<String>();

		colors.add("yellow");
		colors.add("red");
		colors.add("blue");
		colors.add("white");
		colors.add("brown");


		// modern iteration syntax for collection elements, Java 5 and later
		// for-each loop

		System.out.println("List iteration: using for-each loop \n");
		
		for (String eleman : colors) {
			
			System.out.println(eleman);
			
			// cannot remove an item while iterating
			//colors.remove(); // does not work! causes ConcurrentModificationException
			
		}
		
		System.out.println();
		
		// traditional iteration using Iterator interface
		// define iterator on the collection
		// methods: next(), hasNext(), 
		// remove()
		
		// hasNext()	: Returns true if the iteration has more elements.
		// next() 	: Returns the next element in the iteration.
		// remove()	: Removes from the underlying collection the last element returned by this iterator
		// Iterators allow the caller to remove elements from the underlying collection during the iteration 

		
		System.out.println("List iteration: using Iterator interface \n");

		Iterator<String> it = colors.iterator(); 

		while (it.hasNext()) {
			String renk = it.next();
			System.out.println(renk);
			
			// using iterator has capability to remove items while iterating
			it.remove();
			
		}
		
		System.out.println("\nAfter traditional iteration:\n" + colors);
		
		
		// ------------------------------------------------------------------------
		// Set iteration examples -------------------------------------------------
		// ------------------------------------------------------------------------

		Set<String> scientists = new TreeSet<String>();

		scientists.add("Ada Lovelace");
		scientists.add("Charles Babbage");
		scientists.add("Grace Hopper");
		scientists.add("Alan Turing");
		scientists.add("Dennis Ritchie");
		scientists.add("James Gosling");
		scientists.add("Bjarne Stroustrup");

		// modern iteration syntax for collection elements
		// for-each loop

		System.out.println("\nSet iteration: using for-each loop \n");
		
		for (String person : scientists) {
			
			System.out.println(person);
			
			// cannot remove an item while iterating
			//scientists.remove("James Gosling"); // does not work! causes ConcurrentModificationException
		}
			
		System.out.println();
		
		// traditional iteration using Iterator interface
		// define iterator on the collection
		// methods: next(), hasNext(), 
		// remove()
		
		System.out.println("\nSet iteration: using Iterator interface \n");

		Iterator<String> it2 = scientists.iterator();
		
		while (it2.hasNext()) {
			
			String person = it2.next();
			System.out.println(person);
			
			// using iterator, can remove
			it2.remove();
		}
		
		System.out.println("\nAfter traditional iteration:\n" + scientists);
		
		// ------------------------------------------------------------------------
		// Map iteration examples -------------------------------------------------
		// ------------------------------------------------------------------------

		Map<Integer, String> city = new HashMap<Integer, String>();

		city.put(35, "izmir");
		city.put(34, "istanbul");
		city.put(25, "erzurum");
		city.put(55, "samsun");
		city.put(07, "antalya");
		city.put(45, "manisa");
		city.put(16, "bursa");


		// modern iteration syntax for collection elements
		// for-each loop
		// iterating map elements (keys and values)
		// Entry, entrySet,      getKey, getValue

		System.out.println("Map iteration: using for-each loop \n");
		
		for (Map.Entry<Integer, String> entry : city.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + "\t:\t" + value);
		
			// cannot remove an item while iterating
			//city.remove(7, "antalya"); // does not work! causes ConcurrentModificationException

		}
		
		System.out.println();

		
		// traditional iteration using Iterator interface
		// define iterator on the collection
		// methods: next(), hasNext(), 
		// remove()

		System.out.println("\nMap iteration: using Iterator interface \n");

		Iterator<Map.Entry<Integer, String>> it3 = city.entrySet().iterator();
		
		while (it3.hasNext()) {
			
			Map.Entry<Integer, String> eleman = it3.next();
			System.out.println(eleman.getKey() + " = " + eleman.getValue());
			
			// using iterators, can remove
			it3.remove();
			
		}
		
		System.out.println("\nAfter traditional iteration:\n" + city);
		
		
	}

}
