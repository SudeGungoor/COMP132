
public class Cube extends ThreeDShape {
	private double side;
	
	public Cube(String name, double side) {
		super(name);
		this.side = side;
	}

	@Override
	public double getVolume() {
		return side*side*side;
	}

	@Override
	public double getArea() {
		return 6*side*side;
	}
	@Override
	public void getCornerNumber() {
		// TODO Auto-generated method stub
		System.out.println("0");
	}

}
