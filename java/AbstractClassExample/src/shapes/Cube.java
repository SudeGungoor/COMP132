// A concrete class: Cube
// can be used to instantiate objects.
// A concrete subclass of an abstract superclass ...
// ... must provide concrete implementations ...
// ... of each of the superclass’s abstract methods.

package shapes;

public class Cube extends ThreeDShape {

	private double side;

	public Cube(String name, double side) {
		super(name);
		this.side = side;
	}
	
	// implementation of the abstract methods
	@Override
	public double getVolume() {
			return Math.pow(side, 3);
	}
	@Override
	public double getArea() {
			return 6 * Math.pow(side, 2);
	}
}
