
public abstract class Shape implements Cornered {
	private String name;
	
	public Shape(String name){
		setName(name);
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public abstract double getArea();

	@Override
	public void getCornerNumber() {
		// TODO Auto-generated method stub
		
	}
	
	
}
