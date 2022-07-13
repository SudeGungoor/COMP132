package hierarchy;

public class App {

	public static void main(String[] args) {
	
		Student s1 = new Student("Selin");
		Computer c1 = new Computer(132);
	/*	
		s1.study(); s1.display();
		c1.calculate(); c1.display();
	*/
		
		// message field of interface Visible
		System.out.println("Message field of interface: " + Visible.message);
	
		
		// upcasting
		Visible v1 = new Student("Serdar");
		v1.display();

		Visible v2 = c1;
		v2.display();
		
		
		// A high level reference (interface in this example, or superclass) can
		// be used to call methods of that high level
		// Example: study() is not a method of Visible interface, but is a method
		// of Student class
		//v1.study(); // compile error!
		
		
		// downcasting to a specific type (class or subclass)
		// by downcasting, now we can call study() method of Student
		((Student) v1).study();

		// When downcasting a reference: if the referenced object does not have
		// is-a relationship with the type in the cast operator,
		// ClassCastException occurs
		// Example: referenced object v1 is Student, cast operator is
		// Computer. Therefore, exception occurs.

		//((Computer)v1).calculate();

		// better to check first with instanceof operator
		if (v1 instanceof Computer)
					((Computer) v1).calculate();
		else
					System.out.println("v1 is not an instance of Computer");
				
	
		// An interface allows objects of unrelated classes to be processed
		// polymorphically by responding to the same method calls.
		// Examples below

		// create array of type interface Visible
		Visible[] vis = new Visible[4];
				
		// interface references for different objects that implement Visible interface

		vis[0] = new Student("Ayse");
		vis[1] = new Computer(5555);
		vis[2] = new Student("Ahmet");
		vis[3] = new Computer(777);

		// generically process each element in array vis
		for (int i = 0; i < vis.length; i++) {
				System.out.println(".....................");
				showInfo(vis[i]);

				// instanceof and type downcasting examples
				if (vis[i] instanceof Computer)
						((Computer) vis[i]).calculate();
				else if (vis[i] instanceof Student)
						((Student) vis[i]).study();
				}

		
		// or, another way to generically process each element in array vis
		System.out.println("\n ---- Another way: ---- ");

		for (Visible current : vis) { // instead of using loop index

			System.out.println(".....................");
			showInfo(current);
					
			// instanceof, and type downcasting examples
				if (current instanceof Computer)
						((Computer) current).calculate();
				else if (current instanceof Student)
						((Student) current).study();
			}
				
		
		System.out.println(".....................");
		// example with interface Living. Student implements Living.
		Living s2 = s1;
		s2.action();
		
	} // end of main
	

	// when a method parameter is declared as interface type (example below)
	// or superclass type, the method processes the object received
	// as an argument polymorphically
	public static void showInfo(Visible i) {
			i.display();
			// get type name of the object in i
			System.out.println("Class of object is " + i.getClass().getName());
	}
		
} // end of App
