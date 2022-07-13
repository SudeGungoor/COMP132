public class Student implements Comparable<Student> {
	
	private String name;
	private int id;

	public Student(String name, int id){
		this.name = name;
		this.id = id;
	}
	
	public String getName(){
		return this.name;
	}

	public int getId(){
		return this.id;
	} 
			
	@Override
	public int compareTo(Student s) {
		if (id > s.id) return 1;
		if (id < s.id) return -1;
		return 0;
	}

	public String toString(){
		 return "Id: " + this.id + " Name: " + this.name;
	}

}
