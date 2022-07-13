package shapeApp;

//Inheritance example: Shape, Triangle
public class App {

	public static void main(String[] args) {
			
		Shape s1 = new Shape("My shape");
		s1.displayInfo(); // call method displayInfo() of Shape

		Triangle t1 = new Triangle("My triangle", 3, 4);
		t1.displayInfo(); // call method displayInfo() of Triangle
		
		System.out.println("Area of t1: " + t1.area());
		
		// Triangle can directly access to protected variable (name) of superclass Shape
		// won't work if name was private
		System.out.println("Name of t1: " + t1.name); 
		
		// calling overridden toString() methods of Shape and Triangle
		System.out.println(s1 + "\n" + t1);
		// or: System.out.println(s1.toString() + "\n" + t1.toString());
		
		// self study:
		// write test code calling methods for the Circle object
		
		Circle s11 = new Circle("SUDE", 6);
		s11.area(); // call method displayInfo() of Shape

		Circle s111 = new Circle("SUDE", 6);
		s111.periphery(); // call method displayInfo() of Shape

		Circle s1111 = new Circle("SUDE", 6);
		s1111.displayInfo(); // call method displayInfo() of Shape
		
		Circle s11111 = new Circle("SUDE", 6);
		s11111.toString(); // call method displayInfo() of Shape
		
		
	}
}
