import java.util.Set;
import java.util.TreeSet;

public class Department {
	
	private String departmentName;
	private Set<Student> depStudents;

	public Department(String name)
	{
		departmentName=name;
		depStudents = new TreeSet<Student>();
	}

	public String getDepartmentName(){
		return this.departmentName;
	}
	
	public Set<Student> getDepStudents() {
		return this.depStudents;
	}

	public void addStudent(Student S){
		this.depStudents.add(S);
	}
	
	public Set<Student> doubleMajorStudents(Department otherDep){
	
		// declare and initialize set doubleMajorStd to otherDepStd
		Set<Student> doubleMajorStd = new TreeSet<Student>(otherDep.depStudents);
		
		// retainAll: Retains only the elements in this set that are contained in the specified collection.
		doubleMajorStd.retainAll(depStudents);
								
		return doubleMajorStd;
	}

}
