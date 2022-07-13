package app;

import java.util.ArrayList;
import java.util.List;

public class TestWildcard {

	public static void main(String[] args) {
			
   // create, initialize and output List of Integers, then 
   // display product of the elements 
   Integer[] integers = {1, 2, 3, 4, 5};
   
   List<Integer> integerList = new ArrayList<>();

   // insert elements in integerList
   for (Integer item : integers) {
      integerList.add(item);
   }

   System.out.println("integerList contains : " + integerList);
   System.out.println("Product of the elements :" +  multiply(integerList));
   
   //////////////////////////////////////////////////////////////////
   // create, initialize and output List of Doubles, then 
   // display product of the elements 
   Double[] doubles = {1.1, 3.3, 5.5};
   List<Double> doubleList = new ArrayList<>();

   // insert elements in doubleList
   for (Double element : doubles) {
      doubleList.add(element);
   }

   System.out.println("\ndoubleList contains : " + doubleList);
   System.out.println("Product of the elements :" +  multiply(doubleList));

   //////////////////////////////////////////////////////////////////
   // create, initialize and output List of Numbers containing 
   // both Integers and Doubles, then display product of the elements 
   
   Number[] numbers = {1, 2.5, 3, 4.3, 5}; // Integers and Doubles
   List<Number> numberList = new ArrayList<>();

   // insert elements in numberList
   for (Number element : numbers) {
      numberList.add(element);
   }
 
   System.out.println("\nnumberList contains : " + numberList);
   System.out.println("Product of the elements :" +  multiply(numberList));

  
}

// multiply the elements; using a Wildcard in the List parameter
	
//	A wildcard-type argument is denoted by a question mark (?), which by itself represents an “unknown type”. 
//	In this example, the wildcard extends class Number, which means that the wildcard has an upper bound of Number. 
//	Thus, the unknown-type argument must be either Number or a subclass of Number. 
	
// Restriction: Wilcard ? cannot be used as a type name within the method (e.g. cannot replace Number with ?)
	
public static double multiply (List<? extends Number> list) {

	double product = 1; // initialize product

   // calculate product
   for (Number element : list) {
      product *= element.doubleValue();
   }

   return product;
}

}
