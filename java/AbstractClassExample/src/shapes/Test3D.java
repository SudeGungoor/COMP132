package shapes;

public class Test3D {

	public static void main(String[] args) {
	
		// cannot create object of an abstract class! compilation error.
		// ThreeDShape t0 = new ThreeDShape("132 3D"); // does not work.
		
		ThreeDShape t1 = new Cube ("132 cube", 10);
		
		ThreeDShape t2 = new Sphere ("132 sphere", 10);
		
		//System.out.println(t1.getVolume());
		//System.out.println(t2.getVolume());
		
		System.out.println("Computing for: " + t1.getName());
		t1.compute();

		System.out.println("\n...............................");

		System.out.println("Computing for: " + t2.getName());
		t2.compute();		
		
	}

}
