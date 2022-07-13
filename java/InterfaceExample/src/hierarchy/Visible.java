// Interface example

// Interface definition (keyword: interface)
// contract with the compiler:
// (A class implementing an interface says “I will declare all the methods specified by the interface or I will declare my class abstract.”)
// enables unrelated classes to implement a set of common methods (and constants).
// (An interface cannot be instantiated (no constructor))
// (defines and standardizes the ways in which things can interact with one another.) 
// A Java interface describes a set of methods that can be called on objects. 

// allows objects of unrelated classes to be processed polymorphically by responding to the same method calls. 
// can create an interface that describes the desired functionality, 
// then implement this interface in any classes that require that functionality. 

package hierarchy;

public interface Visible {

	// (All fields in an interface are implicitly public, static and final.)
	String message = "Visible interface";
	
	// By definition the method is abstract (just declaration, no implementation)
	// All classes implementing this interface must have their implementation of method.
	// (All methods in an interface are by default abstract and public.)
	void display();

	// (can define several methods as required in an interface)
		
}
