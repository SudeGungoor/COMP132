
public class Book {

	private String name;
	private int count;
	private Boolean rented;

	public Book(String  name, int i){
		this.name = name;
		count = i;
		if (i > 0)
			rented=false;
		else 
			rented=true;
	}

	public String getName(){
		return this.name;
	}

	public int getCount(){
		return this.count;
	}

	public void setCount(int a){
		this.count = a;
		if (this.count > 0)
			this.rented = false;
		else
			this.rented = true;
	}

	public boolean borrow(){

		if (this.rented == false){
			this.count = this.count - 1;
			
			if (this.count == 0){
				this.rented = true;
			}
			return true;
		}
		
		return false;
	}

	public boolean isBorrowed() {
		return rented;
	} 

	public void  returnBook(){
		this.count = this.count + 1;
		this.rented = false; 
	}

	public String toString(){
		return "Book " + name + " has " + count + "  Copies.\n";
	}
}
