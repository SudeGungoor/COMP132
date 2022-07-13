import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		Library ku = new Library();

		Book book1 = new Book("Introduction to Programming",5);
		Book book2 = new Book("Introduction to Java",5);
		Book book3 = new Book("Introduction to CPP",5);
		Book book4 = new Book("Introduction to Python",5);

		List<Book> listOfBooks = new LinkedList<Book>();
		listOfBooks.add(book1);
		listOfBooks.add(book2);
		listOfBooks.add(book3);
		listOfBooks.add(book4);
		ku.addBooks(listOfBooks);

		if(!ku.available("Introduction to Ruby")){
			System.out.println("Introduction to Ruby is not available at the library"); 
		}

		System.out.println("Introduction to Programming has " + ku.copyCount("Introduction to Programming") +  " copies available in the Library");

		listOfBooks.clear();
		Book book5 = new Book("Introduction to Ruby",5);
		listOfBooks.add(book5);
		ku.addBooks(listOfBooks);

		System.out.println("\nThe sorted list of books are:");
		// listOfBook method of Library does the sorting
		LinkedList<String> namesofBooks = ku.listOfBooks();
		for (String name : namesofBooks){
			System.out.println(name);
		}

		listOfBooks.clear();
		book1 = new Book("Introduction to Programming",2);
		book2 = new Book("Introduction to Java",2);
		book3 = new Book("Introduction to CPP",2);
		book4 = new Book("Introduction to Python",2);
		book5 = new Book("Introduction to Ruby",2);
		listOfBooks.add(book1);
		listOfBooks.add(book2);
		listOfBooks.add(book3);
		listOfBooks.add(book4);
		listOfBooks.add(book5);
	
		ku.issueBook(listOfBooks);
		System.out.println(ku.toString());

		System.out.println("Returning the books.");
		listOfBooks.clear();
		book1 = new Book("Introduction to Programming",1);
		book2 = new Book("Introduction to Java",1);
		book3 = new Book("Introduction to CPP",1);
		book4 = new Book("Introduction to Python",1);
		book5 = new Book("Introduction to Ruby",1);
	
		listOfBooks.add(book1);
		listOfBooks.add(book2);
		listOfBooks.add(book3);
		listOfBooks.add(book4);
		listOfBooks.add(book5);
		ku.addBooks(listOfBooks);

		System.out.println(ku);
	}
}
