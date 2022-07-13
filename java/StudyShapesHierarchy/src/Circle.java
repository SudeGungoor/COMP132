
public class Circle extends TwoDShape {
	private double radius;
	
	public Circle(String name, double radius) {
		super(name);
		setRadius(radius);
	}
	
	public void setRadius(double radius){
		if (radius >= 0)
			this.radius = radius;
		else{
			// error message
		}
	}

	@Override
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}

	@Override
	public double getArea() {
		return Math.PI*radius*radius;
	}
	@Override
	public void getCornerNumber() {
		// TODO Auto-generated method stub
		System.out.println("0");
	}
}
