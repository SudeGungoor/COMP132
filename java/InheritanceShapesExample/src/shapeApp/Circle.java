package shapeApp;

public class Circle extends Shape {
	// self study: 
	// define data radius for this subclass Circle
	protected int radius;
	
	// override constructor, displayInfo(), toString() methods
	// write new methods area(), periphery(), use Math.PI
	
	public void area() {
		int area = (int) (Math.PI * 2 * radius * radius);
		System.out.println("Area: " + area);
	}
	
	public Circle(String name, int radius) {
		super(name);
		this.radius = radius;
	}

	public void periphery() {
		int periphery = (int) (Math.PI * 2 * radius );
		System.out.println("Periphery: " + periphery);
	}

	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		super.displayInfo();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
	
}
