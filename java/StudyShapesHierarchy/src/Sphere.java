
public class Sphere extends ThreeDShape {
	private double radius;
	
	public Sphere(String name, double radius) {
		super(name);
		this.radius = radius;
	}

	@Override
	public double getVolume() {
		return 4*Math.PI*radius*radius*radius/3;
	}

	@Override
	public double getArea() {
		return 4*Math.PI*radius*radius;
	}

	@Override
	public void getCornerNumber() {
		// TODO Auto-generated method stub
		System.out.println("0");
	}
	
}
