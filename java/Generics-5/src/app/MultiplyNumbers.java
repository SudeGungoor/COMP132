package app;
// MultiplyNumbers.java
// Multiplying the numbers in a List<Number>.
import java.util.ArrayList;
import java.util.List;

public class MultiplyNumbers {
   public static void main(String[] args) {
  
	  // create, initialize and output List of Numbers containing 
      // both Integers and Doubles, then display product of the elements 

	  // Java autoboxes each primitive value as an object of its corresponding wrapper type.
	  // e.g. int values 1 and 3 are autoboxed as Integer objects. 
	  // e.g. double 2.5 and 4.2 are autoboxed as Double objects.

	  Number[] numbers = {1, 2.5, 3, 4.2}; // Integers and Doubles

	  List<Number> numberList = new ArrayList<>();           

      for (Number element : numbers) {
         numberList.add(element); // place each number in numberList
      }

      System.out.printf("numberList contains: %s%n", numberList);
      System.out.printf("Product of the elements in numberList: %.1f%n", product(numberList));
      
      // Question: can we call the method product with a List of Integers: List<Integer> ?
      
   }

   // calculate product of List elements
   public static double product(List<Number> list) {
      double product = 1; // initialize product

      // calculate product
      for (Number element : list) {     
         product *= element.doubleValue();
      }                                 

      return product;
   }
}

