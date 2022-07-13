
// Generic Pair class testing program.

public class PairTest {
   public static void main(String[] args) {
      // create pair of integer and string
      Pair<Integer, String> numberPair = 
         new Pair<Integer, String>(1, "one");
      
      // display original numberPair
      System.out.printf("Original pair: <%d, %s>\n", 
         numberPair.getFirst(), numberPair.getSecond()); 
      
      // modify pair
      numberPair.setFirst(2);
      numberPair.setSecond("Second");

      // display modified numberPair
      System.out.printf("Modified pair: <%d, %s>\n", 
         numberPair.getFirst(), numberPair.getSecond());
   } 
}


