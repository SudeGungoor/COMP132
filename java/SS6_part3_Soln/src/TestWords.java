import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class TestWords {

	public static void main(String[] args) {
		
		// input text
		String intext = new String("This is my program "
				+ "This is the program mapping a text of words into "
				+ "a Map of the words and the counts "
				+ "counts words on and ON and oN until "
				+ "THE END");
		
		// create LinkedHashMap mymap
		Map<String, Integer> mymap =  new LinkedHashMap<String, Integer>();
		
		// call TextToMap method
		mymap = textToMap(intext);
		
		// call printMyMap method
		printMyMap(mymap);
	
		// call findFirstHighLowCounts method
		findFirstHighLowCounts(mymap);
	
	}
			
	//method for putting the words in the sentence and word counts in a Map<String, Integer>
	public static Map<String, Integer> textToMap(String mytext) {

		Map<String, Integer> mymap = new LinkedHashMap<String, Integer>() ;
		StringTokenizer tokenizer = new StringTokenizer(mytext);
		
		//separating the words in the sentence and putting in the Map
		while(tokenizer.hasMoreTokens()){
		
			String word = tokenizer.nextToken().toLowerCase();
			if(mymap.containsKey(word)){
				mymap.put(word, mymap.get(word)+1);
			}
			else 
				mymap.put(word, 1);
		}
		return mymap;
	}
	
	
	//method for printing the map of words and their counts
	public static void printMyMap(Map<String, Integer> mymap){

		System.out.println("\nWord\t\t\t" + "Count");
		System.out.println("=====\t\t\t" + "=====");
		for (String Key : mymap.keySet()) {
			System.out.println(Key +"\t\t\t" + mymap.get(Key));
		}
	}
	
	//method that finds the first word with the lowest count, and the first word with the highest count
	public static void findFirstHighLowCounts(Map<String, Integer> mymap){

		int low = 1000, high = 0;
		String lowWord = "";
		String highWord = "";

		for (String currentkey : mymap.keySet()) {

			if (mymap.get(currentkey) < low) {
				low = mymap.get(currentkey);
				lowWord = currentkey;	
			}

			if (mymap.get(currentkey) > high) {
				high = mymap.get(currentkey);
				highWord = currentkey;	
			}
		}
		
		System.out.println("\nThe first word with the lowest count is: " + lowWord + " (count value: " + low + ")");
		System.out.println("The first word with the highest count is: " + highWord + " (count value: " + high + ")");
	}
	
}