import java.util.*;

public class Library {

	private LinkedList<Book> availableBooks;

	public Library(){
		availableBooks = new LinkedList<Book>();
	}

	public boolean returnBook(String name){

		if (available(name)){

				// for-each loop to iterate over the List elements
				for(Book currentBook : availableBooks ){
					if(currentBook.getName().equals(name)){
						availableBooks.get(availableBooks.indexOf(currentBook)).setCount(currentBook.getCount()+1);
						return true;
					}
				}
		
			
			// Alternative iteration: Using iterators to iterate over the List elements
			/* 
			Iterator<Book> it = availableBooks.iterator();

			while(it.hasNext()){
				Book temp = it.next();
				if(temp.getName().equals(name)){
					availableBooks.get(availableBooks.indexOf(temp)).setCount(temp.getCount()+1);
					return true;
				}
			}
			 */
		}
		availableBooks.add(new Book(name,1));
		return true;
	}

	public void addBooks(List<Book> newBooks){

		for (Book book1 : newBooks){
			if (available(book1.getName())){
				for (Book book2 : availableBooks){
					if(book1.getName().equals(book2.getName()) ){
						//Incrementing the count of a book by accessing the book by using the indexof method
						availableBooks.get(availableBooks.indexOf(book2)).setCount(book2.getCount() + book1.getCount());
					}
				}
			}
			else {
				availableBooks.add(book1);
			}
		}
	}

	public boolean available(String name){
	
		// for-each loop to iterate over the List elements
		for(Book currentBook : availableBooks ){
			if(currentBook.getName().equals(name))
				return true;
		}
		return false;
		
	
		// Alternative iteration: Using iterators to iterate over the List elements
		/* 
		Iterator<Book> it = availableBooks.iterator();
		while(it.hasNext()){
			Book temp = it.next();
			if(temp.getName().equals(name))
				return true;
		}
		return false;
		*/
	}

	public int copyCount(String name){

		// for-each loop to iterate over the List elements
		for(Book currentBook : availableBooks ){
			if(currentBook.getName().equals(name))
					return currentBook.getCount();
		}
		return -1;
			
		// Alternative iteration: Using iterators to iterate over the List elements
		/* 
		Iterator<Book> it = availableBooks.iterator();
		while(it.hasNext()){
			Book temp = it.next();
			if(temp.getName().equals(name))
				return temp.getCount();
		}
		return -1;
		*/
	}

	public LinkedList<String> listOfBooks(){

		LinkedList<String> namesOfBooks = new LinkedList<String>();

		// for-each loop to iterate over the List elements
		for(Book currentBook : availableBooks ){
				if(currentBook.getCount() > 0)
					namesOfBooks.add(currentBook.getName());			
		}
				
		
		// Alternative iteration: Using iterators to iterate over the List elements
		/*
		Iterator<Book> it = availableBooks.iterator();
		while(it.hasNext()){
			Book temp = it.next();
			if(temp.getCount()>0)
				namesOfBooks.add(temp.getName());

		}
		*/
				
		//sorting the List namesOfBooks in ascending order 
		Collections.sort(namesOfBooks);
		return namesOfBooks;
	}

	
	public void issueBook(List<Book> newBooks){

		for (Book book1 : newBooks){
			if ( available(book1.getName()) && copyCount(book1.getName())>0){
				for (Book book2 : availableBooks){
					if(book1.getName().equals(book2.getName()) && book2.getCount() >= book1.getCount() ){

						availableBooks.get(availableBooks.indexOf(book2)).setCount(book2.getCount()-book1.getCount());

					}
					else if(book1.getName().equals(book2.getName()) && book1.getCount() > book2.getCount() ){

						System.out.println(book1.getName() + " have not enough copies to issue");
					}
				}
			}
			else {
				System.out.println(book1.getName() +" is not available in library" );;
			}
		}
	}

	public String toString(){
		String str = "\nBooks in the Library: \n";
		
		// for-each loop to iterate over the List elements
		for(Book currentBook : availableBooks ){
			str += currentBook.toString();	
		}
		return str;
						
		// Alternative iteration: Using iterators to iterate over the List elements
		/*
				 
		Iterator<Book> it = availableBooks.iterator();
		while(it.hasNext()){
			str += it.next().toString();
		}
		return str;
		*/
	}

}
