// Generic class example: MyStack generic class implementation 

package app;

import java.util.ArrayList;

public class MyStack<E> {
	
	  private ArrayList<E> elements; // ArrayList stores stack elements
	  
	   // constructor creates a stack of the specified number of elements
	   public MyStack(int capacity) {
		   
	      int initCapacity = capacity > 0 ? capacity : 10; // validate
	      elements = new ArrayList<E>(initCapacity); // create ArrayList

	   }  
	   
	   // no-argument constructor creates a stack of the default size
	   public MyStack() {
		   
	      this(10); // default stack size
	      
	   }
	   
	   // push element onto stack
	   public void push(E pushValue) {

		   elements.add(pushValue); // place pushValue on MyStack

	   } 
	   
	   // return the top element if not empty
	   public E pop() {
	
		  if (elements.isEmpty()) { // if stack is empty
	         System.out.println("Stack is empty, cannot pop");
	         return null; 
	         // a null value can be assigned to an object reference of any type 
	         // to indicate that it points to nothing 
	      } 
	      // remove and return top element of MyStack
	      return elements.remove(elements.size() - 1); 
	   }

	@Override
	public String toString() {
		return "MyStack [elements=" + elements + "]";
	}
  

}
