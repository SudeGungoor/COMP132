// Collections example: Set interface. HashSet, LinkedHashSet and TreeSet.

// A Set is an unordered Collection of unique elements (i.e., no duplicate elements). 
// The collections framework contains several Set implementations, including HashSet, LinkedHashSet and TreeSet. 
// (HashSet stores its elements in a hash table, and TreeSet stores its elements in a tree.) 

package sets_examples;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		// HashSet does not keep any order of elements
		//Set<String> set1 = new HashSet<String>();
		
		// LinkedHashSet keeps the order of addition to the set
		//Set<String> set1 = new LinkedHashSet<String>();
		
		// TreeSet sorts in the natural order (e.g. for Strings: alphabetical order)
		Set<String> set1 = new TreeSet<String>();

		// checking if the set is empty
		//if (set1.isEmpty()) System.out.println("set1 is empty");
		
		// adding elements to set1
		set1.add("red");
		set1.add("blue");
		set1.add("yellow");
		set1.add("black");
		set1.add("pink");
		
		System.out.println("Set 1 contains elements: \n" + set1);
				
		// no duplicate elements in a set
		set1.add("blue");
				
		//System.out.println(set1);
			
		
		// Iterating elements in a set, for-each loop
		for (String eleman : set1)
				System.out.println(eleman);
				
		// contains: checking if the set contains a given element
		//if (set1.contains("pink")) System.out.println("set1 has element pink");
			
		//if (set1.isEmpty()) System.out.println("set1 is empty");
		
		// remove all elements in the set
		//set1.clear();
		
		//if (set1.isEmpty()) System.out.println("after clear: set1 is empty");
	
		// (for other methods available for Set: https://docs.oracle.com/javase/8/docs/api/java/util/Set.html)
		
		//////////////////////////////////////////////////////////////////////////////////////////
		// set operations examples:
		//////////////////////////////////////////////////////////////////////////////////////////
		Set<String> set2 = new TreeSet<String>();

		// adding items to set2
		set2.add("red");
		set2.add("white");
		set2.add("yellow");
		set2.add("brown");
		set2.add("orange");

		System.out.println("Set 2 contains elements: \n" + set2);
		
		// set operations example: intersection -----------------------------
		//////////////////////////////////////////////////////////////////////////////////////////
		// declare and initialize set intersect to set1
		Set<String> intersect = new TreeSet<String>(set1);
				
		// retainAll: Retains only the elements in this set that are contained in the specified collection.
		intersect.retainAll(set2);
		System.out.println("========= \tIntersection set of set1 and set2:\t =========");
		System.out.println(intersect);
		
		// set operations example: difference -----------------------------
		//////////////////////////////////////////////////////////////////////////////////////////
		// declare and initialize set differ to set1
		Set<String> differ = new TreeSet<String>(set1);

		// removeAll: Removes from this set all of its elements that are contained in the specified collection. 
		differ.removeAll(set2);
		System.out.println("========= \tDifference set of set1 from set2:\t =========");
		System.out.println(differ);
		
		// (part of self study)
		// set operations example: union -----------------------------
		//////////////////////////////////////////////////////////////////////////////////////////
		// declare and initialize set union to set1
		Set<String> union = new TreeSet<String>(set1);
		
		// addAll: Adds all of the elements in the specified collection to this set if they're not already present.
		union.addAll(set2);
		System.out.println("========= \tUnion set of set1 and set2:\t\t =========");
		System.out.println(union);	
	}

}
