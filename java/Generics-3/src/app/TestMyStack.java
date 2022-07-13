package app;

public class TestMyStack {

	public static void main(String[] args) {

	      // Create a MyStack<Double>, a MyStack<Integer>, and a MyStack<String>
	      MyStack<Double> st1 = new MyStack<>(7); 
	      MyStack<String> st2 = new MyStack<>(5); 
	      MyStack<Integer> st3 = new MyStack<>();

	      //////////////////////////////////////////////////////////////////
	      
	      System.out.println("Testing stack with double elements:");
	      
	      st1.push(3.14);
	      st1.push(2.25);
	      st1.push(5.43);
	      System.out.println(st1);
	      
	      st1.pop();
	      System.out.println(st1);
	      
	      //////////////////////////////////////////////////////////////////

	      String[] colors = {"yellow", "red", "white"};
	      
	      System.out.println("\nTesting stack with string elements:");
	      
	      addArrayStack(st2, colors);
	      System.out.println(st2);
	      
	      removeOneStack(st2);
	      System.out.println(st2);
	      
	      addArrayStack(st2, colors);
	      System.out.println(st2);
	      
	      //////////////////////////////////////////////////////////////////

	      Integer[] numbers = {2, 4, 6, 8, 10, 12};
	      
	      System.out.println("\nTesting stack with integer elements:");
	      
	     // addArrayStack(st3, numbers);
	     // System.out.println(st3);
  
	      removeOneStack(st3);
	      System.out.println(st3);
	      
	      
	} // end of main
	
	// generic method addArrayStack: adds elements of an array to Mystack

	public static <E> void addArrayStack(MyStack<E> st, E[] elements) {    
		
	      // push elements onto MyStack
	      for (E element : elements) {
	         System.out.println("element " + element + " added to stack");
	         st.push(element); // push element onto stack
	      }
	}
	
	// generic method removeOneStack: remove one element from Mystack and return it
	
	public static <E>  E  removeOneStack(MyStack<E> st) {    
		
		System.out.println("removing one element from stack");
	    return st.pop(); 

	}
	

}
