package shapeApp;

//Inheritance example: Shape, Triangle
public class Shape {

	// data access modifiers (public, private, protected)
	// public: visible (accessible) everywhere
	// private: visible only within this class (Shape)
	// protected: visible anywhere within class, its subclasses, and this package
	// no modifier: visible anywhere within this package only
	protected String name;

	// constructor
	public Shape(String name) {
		this.name = name;
		System.out.println("Shape class constructor: " + name);
	}

	// method displayInfo
	public void displayInfo() {
		System.out.println("Shape displayInfo: This is a shape with name: " + name + "\n");
	}

	// overriding Object.toString() method
	// (Object is the root superclass of all classes in Java)
	@Override
	public String toString() {
		return "Shape [name=" + name + "]";
	}
	
}
