// Collections example: Map interface. HashMap, LinkedHashMap and TreeMap. 
// Maps associate keys to values. 
// Elements of a Map: <key, value> pairs
// The keys in a Map must be unique, but the associated values need not be. 

package map_examples;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {
		
		// HashMap does not keep any order of elements
		// Example: HashMap with Integer keys and String values
		Map<Integer, String> plates = new HashMap<Integer, String>();
		
		// Methods
		// put: creates a new entry in the map or replaces an existing entry�s value
		plates.put(35, "izmir");
		plates.put(34, "istanbul");
		plates.put(25, "erzurum");
		plates.put(55, "samsun");
		plates.put(07, "ankara");
		
		// keys are unique. The following overrides the existing entry (with key 07)
		plates.put(07, "antalya");
		
		// get: returns the value of the given key
		String city = plates.get(55);
		System.out.println(city);
		
		// methods examples
		// size: returns the number of key/value pairs in the Map. 
		// boolean isEmpty:, containsKey:, containsValue:
		
		System.out.println(plates.size());
		if (plates.containsKey(35)) System.out.println("key 35 is in the set, its value is " + plates.get(35));
		if (plates.containsValue("bursa")) System.out.println("value bursa is in the set");
		
		if (plates.isEmpty()) 
			System.out.println("The plates is empty");
		else 
			System.out.println("Size of the map plates: " + plates.size());
		
		// iterating HashMap elements (keys and values)
		// Entry, entrySet,      getKey, getValue
		for (Map.Entry<Integer, String> entry : plates.entrySet()) {
	
			int key = entry.getKey();
			String value = entry.getValue();

			System.out.println(key + ":" + value);
		}
		
		// (for other methods available for Map: https://docs.oracle.com/javase/8/docs/api/java/util/Map.html)
		
		
		//////////////////////////////////////////////////////////////////////////////////////////
		// Examples on Map types: HashMap, LinkedHashMap, TreeMap
			
		// HashMap does not keep any order of elements
		Map<Integer, String> hashplates = new HashMap<Integer, String>();
		
		// LinkedHashMap keeps the order of addition to the map
		Map<Integer, String> linkedhashplates = new LinkedHashMap<Integer, String>();
		
		// TreeMap sorts elements in the natural order (e.g. for numbers: numerical order)
		Map<Integer, String> treeplates = new TreeMap<Integer, String>();
		
		printMap(hashplates, "Hash map");
		printMap(linkedhashplates, "Linked Hash map");
		printMap(treeplates, "Tree map");
		
	} // end of main method
	
	// using Map interface as the argument (enables polymorphic behavior)
	public static void printMap(Map<Integer, String> map, String type) {

			map.put(35, "izmir");
			map.put(34, "istanbul");
			map.put(25, "erzurum");
			map.put(55, "samsun");
			map.put(07, "antalya");
			map.put(45, "manisa");
			map.put(16, "bursa");
		
			System.out.println("Iterating for " + type);

			// keySet: returns a set of the keys
			for (Integer plateNo : map.keySet()) {
				String city = map.get(plateNo);
				System.out.println(plateNo + "\t : " + city);
			}

		}

}
