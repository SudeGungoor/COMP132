import java.util.Scanner;

// Information validation using Regular Expressions

public class StringMatches {

	 public static void main(String[] args) {
	 
		 // get user input
	      Scanner scanner = new Scanner(System.in);
/*
   	      System.out.println("Enter zip code:");   // format: 5 digits
	      String zip = scanner.nextLine();
	      
	      if (zip.matches("\\d{5}")) //  length: 5, each char: digit
	      		System.out.println("Valid!");
	      else
	    	  System.out.println("Invalid zip code...");
*/
	      
/*
	      System.out.println("Please enter code name:"); // format: Ab
	      String codeName = scanner.nextLine();

	      if (codeName.matches("[A-Z][a-z]"))
	      		System.out.println("Valid!");
	      else
	    	  System.out.println("Invalid code name...");
  
*/
	      
/*
	      String phone = "123-456-7890"; 
	   
              System.out.println("matches? " + phone.matches("\\d{3}-\\d{3}-\\d{4}"));	 // 

	      System.out.println("matches? " + phone.matches("[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}"));	      

*/
	      

	      System.out.println("Please enter name:"); // Format: Abcd... 
	      String name = scanner.nextLine();

	      if (name.matches("[A-Z][a-zA-Z]*"))
	      		System.out.println("Valid!");
	      else
	    	  System.out.println("Invalid name...");


	 }
} 


