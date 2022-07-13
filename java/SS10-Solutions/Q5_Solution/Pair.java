
// Pair contains two types.

public class Pair<F, S> {
   private F first; // first element of a pair
   private S second; // second element of a pair

   // constructor
   public Pair(F firstElement, S secondElement) {
      setFirst(firstElement);
      setSecond(secondElement);
   }

   // get first
   public F getFirst() {
      return first;
   } 

   // get second
   public S getSecond() {
      return second;
   } 

   // set first
   public void setFirst(F firstElement) {
      first = firstElement;
   }

   // set second
   public void setSecond(S secondElement) {
      second = secondElement;
   } 
}

