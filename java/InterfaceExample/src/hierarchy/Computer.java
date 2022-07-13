
// To use an interface:
// a class must specify that it implements the interface (keyword:	implements)
// the class must implement each method in the interface (if it is a concrete class) 
// or
// the class must be declared as abstract. 

// a class can implement as many interfaces as it needs (e.g. implements Visible, Payable)
// objects of a class that implements an interface have is-a relationship with the interface.
package hierarchy;

public class Computer implements Visible {

	private int id;

	public Computer(int id) {
		this.id = id;
	}

	public void calculate() {
		System.out.println("Computer is calculating.");
	}
	
	// implementing method declared in the interface
	@Override
	public void display() {
			System.out.println("Computer's id is: " + id);
	}
}
