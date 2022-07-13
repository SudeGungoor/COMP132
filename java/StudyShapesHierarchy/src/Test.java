
public class Test implements Cornered {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[4];
		shapes[0] = new Cube("Cube", 100);
		shapes[1] = new Sphere("Sphere", 10);
		shapes[2] = new Circle("Circle", 200);
		shapes[3] = new Square("Square", 20);

		for (int i = 0; i < shapes.length; i++) {
			System.out.println(shapes[i].getArea());
		}
		System.out.println("...");
		for (int i = 0; i < shapes.length; i++) {
			if (shapes[i] instanceof ThreeDShape)
				System.out.println(((ThreeDShape) shapes[i]).getVolume());
			// System.out.println(shapes[i].getVolume()); won't compile Circle
			// doesn't have volume
		}

		// self study: implement an interface Cornered, with method getCornerNumber()
		// test with code below:

	 for (int i=0;i<shapes.length;i++){
		if (shapes[i] instanceof Cornered)
		 ((Cornered) shapes[i]).getCornerNumber();
		}
	}

	@Override
	public void getCornerNumber() {
		// TODO Auto-generated method stub
		
	}
	

}
