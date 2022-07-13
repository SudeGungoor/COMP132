package shapeApp;

//Inheritance example: Shape, Triangle

// Triangle is a subclass of Shape (using keyword "extends")
// subclass Triangle inherits features of its superclass Shape
// subclass can also add its specialized features 
// subclass is more specific, superclass is more general
public class Triangle extends Shape {
	
	// data (name) is inherited from superclass Shape
	// subclass's additional data (base, height) specific to itself
	private double base;
	private double height;

	// constructor
	public Triangle(String name, double base, double height) {
		super(name);
		this.base = base;
		this.height = height;
		System.out.println("Triangle class constructor: " + height + " " + base);
	}

	// methods
	// displayInfo method is inherited from superclass Shape
	// overriding displayInfo: rewriting the method for this subclass
	@Override
	public void displayInfo() {
		System.out.println("Triangle displayInfo: This is a triangle with name: " + name + "\n");

		System.out.println("Calling superclass method: ");
		super.displayInfo();
	}

	// new method of Triangle class, specific to itself
	public double area() {
			return (base * height / 2);
	}

	// overriding toString() method of superclass Shape
	@Override
	public String toString() {
		return "Triangle [base=" + base + " height=" + height + " name=" + name + "]";
	}
}
