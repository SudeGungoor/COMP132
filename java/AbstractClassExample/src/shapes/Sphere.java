// A concrete class: Sphere
// can be used to instantiate objects.
// A concrete subclass of an abstract superclass ...
// ... must provide concrete implementations ...
// ... of each of the superclass’s abstract methods.

package shapes;

public class Sphere extends ThreeDShape {

	private double radius;

	public Sphere(String name, double radius) {
		super(name);
		this.radius = radius;
	}
	
	// implementation of the abstract methods
	@Override
	public double getVolume() {
			 return 4 * Math.PI * Math.pow(radius, 3) / 3;		 
	}
	
	@Override
	public double getArea() {
			 return 4 * Math.PI * Math.pow(radius, 2);		 			
	}	
		
}
