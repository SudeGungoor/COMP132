import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		
		Set<Student> doubleMajor = new TreeSet<Student>();

		Department ComputerEngineering = new Department("Computer Engineering");
		
		ComputerEngineering.addStudent(new Student("Ali",1001));
		ComputerEngineering.addStudent(new Student("Ayca",1003));
		ComputerEngineering.addStudent(new Student("Alper",1005));
		ComputerEngineering.addStudent(new Student("Melike",1007));
		ComputerEngineering.addStudent(new Student("Alihan",1009));
		ComputerEngineering.addStudent(new Student("Ece",1010));
		ComputerEngineering.addStudent(new Student("Muharrem",1012));
		ComputerEngineering.addStudent(new Student("Sitare",1014));
		ComputerEngineering.addStudent(new Student("Ahmet",1016));

		System.out.println("\nStudents in " + ComputerEngineering.getDepartmentName() +" are as follows.");
		for (Student st : ComputerEngineering.getDepStudents()) {
			System.out.println(st);
		}
		
		Department ElectricalEngineering = new Department("Electrical Engineering");
		
		ElectricalEngineering.addStudent(new Student("Alihan",1009));
		ElectricalEngineering.addStudent(new Student("Feyza",1017));
		ElectricalEngineering.addStudent(new Student("Ahmet",1016));
		ElectricalEngineering.addStudent(new Student("Ayca",1003));
		ElectricalEngineering.addStudent(new Student("Burak",1019));
		ElectricalEngineering.addStudent(new Student("Melike",1007));
		ElectricalEngineering.addStudent(new Student("Burak",2005));
		ElectricalEngineering.addStudent(new Student("Pelin",1021));
		ElectricalEngineering.addStudent(new Student("Kaan",1023));
		
		System.out.println("\nStudents in " + ElectricalEngineering.getDepartmentName() +" are as follows.");

		for (Student st : ElectricalEngineering.getDepStudents()) {
			System.out.println(st);
		}
		
		doubleMajor = ComputerEngineering.doubleMajorStudents(ElectricalEngineering);
		
		System.out.println("\nStudents with double Major in " + ElectricalEngineering.getDepartmentName() +" and "+ ComputerEngineering.getDepartmentName()+ " are as follows.");

		for (Student st : doubleMajor){
			System.out.println(st);
		}
	}
}
