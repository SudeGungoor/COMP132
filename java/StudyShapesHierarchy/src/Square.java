
public class Square extends TwoDShape {
	private double side;
	
	public Square(String name, double side) {
		super(name);
		setSide(side);
	}
	
	public void setSide(double side){
		if (side >= 0){
			this.side = side;
		} else{
			// error message
		}
	}

	@Override
	public double getPerimeter() {
		return 4*side;
	}

	@Override
	public double getArea() {
		return side*side;
	}
	@Override
	public void getCornerNumber() {
		// TODO Auto-generated method stub
		System.out.println("0");
	}
}
