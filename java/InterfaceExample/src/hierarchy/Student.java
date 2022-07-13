
// To use an interface:
// a class must specify that it implements the interface (keyword:	implements)
// the class must implement each method in the interface (if it is a concrete class) 
// or
// the class must be declared as abstract. 

// a class can implement as many interfaces as it needs (e.g. implements Visible, Living)
// objects of a class that implements an interface have is-a relationship with the interface.

package hierarchy;

public class Student implements Visible, Living {

	private String name;

	public Student(String name) {
		this.name = name;
	}
	
	public void study() {
		System.out.println("Student is studying.");
	}

	// implementing the method declared in the interface Visible 
	@Override
	public void display() {
		
		System.out.println("Student's name is: " + name);
		
	}

	// implementing the method declared in the interface Living
	@Override
	public void action() {
		
		System.out.println("Student " + name + "'s actions:");
		System.out.println("Student is listening.");
		study();
	}
	
	
	
}
