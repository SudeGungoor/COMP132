package bookstore;

public class Test {

	public static void main(String[] args) {
		
		Book book1 = new Book("The Archer", 200,"1234569875");
		Book book2 = new Book("Veronika Decides to Die", 250,"3214567893");
		EBook book3 = new EBook("The Alchemist", 75, "2135467859", 2,"pdf",3);
		EBook book4 = new EBook("The Fifth Mountain", 120, "4268792215", 3,"pdf",2);
		HardCopyBook book5 = new HardCopyBook("Eleven Minutes", 100, "1652329872", 220, 10);
		HardCopyBook book6 = new HardCopyBook("Brida", 150, "3692587146", 300, 15);
		HardCopyBook book7 = new HardCopyBook("The Spy", 450, "7539516542", 550, 20);
		
				
		ShoppingCart shop = new ShoppingCart();
		shop.addBook(book1);
		shop.addBook(book2);
		shop.addBook(book3);
		shop.addBook(book4);
		shop.addBook(book5);
		shop.addBook(book6);
		shop.addBook(book7);
		
		
		System.out.println(shop.toString());

	}

}
