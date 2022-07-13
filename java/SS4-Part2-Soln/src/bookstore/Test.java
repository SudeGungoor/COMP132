package bookstore;
import shopping.*;

public class Test {

	public static void main(String[] args) {
		

			Customer C= new Customer("V", "H");
			HardCopyBook b1= new HardCopyBook("Java How to Program", 25, "1234569878", 50, 10);
			HardCopyBook b2= new HardCopyBook("C How to Program", 20, "3214569875", 10, 10);		
			HardCopyBook b3= new HardCopyBook("C++ How to Program", 25, "9874563212", 20, 5);
			HardCopyBook b4= new HardCopyBook("The Java Programming Language", 30, "6541239758", 15, 8);
			
			Purchase p = new Purchase("23/10/2020", "23/10/2020", 1);
			p.addBook(b1);
			p.addBook(b2);
			p.addBook(b3);
			p.addBook(b4);
			C.placePurchase(p);
			System.out.println();
			//System.out.println(C);
					
			EBook b5 = new EBook("A Humble Introduction to Erlang", 75, "2135467859", 200,"pdf",1);
			EBook b6 = new EBook("Principles of Programming Languages", 125, "2135467859", 150,"pdf",3);
			EBook b7 = new EBook("Advanced Operating Systems", 50, "2135467859", 250,"pdf",2);
			
			Purchase p2 = new Purchase("23/10/2020", "23/10/2020", 1);
			p2.addBook(b5);
			p2.addBook(b6);
			p2.addBook(b7);
			C.placePurchase(p2);
			System.out.println();
			System.out.println(C);
			
			Book b8=new Book("Cloudy With a Chance of Meatballs", 20, "1236548596");
			
			Purchase p3 = new Purchase("23/10/2020 ", "23/10/2020 ", 1);
			System.out.println();
			p3.addBook(b8);
			C.placePurchase(p3);
					
					
	}

}
