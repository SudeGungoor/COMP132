package app;
// MultiplyNumbersErrors.java
// Multiplying the numbers in an List<Number>.
import java.util.ArrayList;
import java.util.List;

public class MultiplyNumbersErrors {
   public static void main(String[] args) {

	   // create, initialize and output List of Numbers containing 
      // both Integers and Doubles, then display product of the elements 
      Integer[] integers = {1, 2, 3, 4}; 
      List<Integer> integerList = new ArrayList<>();

      for (Integer element : integers) {
         integerList.add(element); // place each number in numberList
      }

      System.out.printf("numberList contains: %s%n", integerList);
      System.out.printf("Product of the elements in numberList: %.1f%n", product(integerList));
      // Error!!!
      
      // Question: 
      // How can we implement a more flexible version of method product 
      // that can multiply the elements of any List containing elements of any subclass of Number
      
      // Answer:
      // 
   }

   // calculate product of List elements
   public static  Number product(List<Number> list) {
	   Number product = 0; // initialize product

      // calculate product
      for (Number element : list) {     
         product = product + element;
      }                                 

      return product;
   }
}
