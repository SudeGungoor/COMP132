
public abstract class ThreeDShape extends Shape {

	public ThreeDShape(String name) {
		super("3DShape: " + name);
	}

	public abstract double getVolume();

	@Override
	public void getCornerNumber() {
		// TODO Auto-generated method stub
		super.getCornerNumber();
	}

}
