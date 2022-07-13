
// Abstract class concepts example

// An abstract class:
// allows you to define the superclass(es) of a class hierarchy. 
// cannot be used to instantiate objects.
// can define common data and functionality that subclasses will need.
// normally contains one or more abstract methods. 
package shapes;

public abstract class ThreeDShape {

	// common data and methods to all subclasses
	protected String name;
	
	public ThreeDShape(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void compute() {
		
		//System.out.println("Area: " + getArea());
		//System.out.println("Volume: " + getVolume());
		
		// Example formatted output
		System.out.format("\nArea: %.2f" , getArea());
		System.out.format("\nVolume: %.2f" , getVolume());
		
	}
	
	// abstract methods
	// just declaration, no implementation in the abstract class
	// force all subclasses to implement these methods

	public abstract double getVolume();
	
	public abstract double getArea();
	
}
