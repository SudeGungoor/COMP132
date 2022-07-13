import validator.IntegerValidator;
import validator.StringValidator;
import validator.ValidationException;

// Rethrowing an exception.

public class Demo4 {
   public static void main(String[] args) {
      try { // call someMethod 
         someMethod();
      }
      catch (Exception exception) {
          System.err.printf("%s\n\n", exception.getMessage());
          exception.printStackTrace();
      }
   } 

   // call someMethod2; rethrow Exceptions back to main
   public static void someMethod() throws Exception {
      try { // call someMethod2 
         someMethod2();
      } 
      catch (Exception exception2) {
         throw exception2; // rethrow the Exception
      } 
   } 

   // throw Exception back to someMethod
   public static void someMethod2() throws Exception {
      throw new Exception("Exception thrown in someMethod2");
   } 
}

try {
	this.firstName.lengthGreater(20);
	this.firstName.lengthFewer(20);
	this.firstName.lengthEqual(20);
} catch (ValidationException e) {
	// TODO Auto-generated catch block
	System.out.println("Validation Exception Occured");
}

try {
	this.lastName.lengthGreater(20);
	this.lastName.lengthFewer(20);
	this.lastName.lengthEqual(20);
	
} 
catch (ValidationException e) {
	// TODO Auto-generated catch block
	System.out.println("Validation Exception Occured");
}


this.age = new IntegerValidator(age);
try {
	this.age.greater(20);
	this.age.less(20);
	this.age.equal(20);
	this.age.even();
	this.age.odd();
	this.age.positive();
	this.age.negative();
	
} catch (ValidationException e) {
	// TODO Auto-generated catch block
	System.out.println("Validation Exception Occured");
}
this.socialSecurityNumber = new IntegerValidator(socialSecurityNumber);
try {
	this.socialSecurityNumber.greater(20);
	this.socialSecurityNumber.less(20);
	this.socialSecurityNumber.equal(20);
	this.socialSecurityNumber.even();
	this.socialSecurityNumber.odd();
	this.socialSecurityNumber.positive();
	this.socialSecurityNumber.negative();
	
} catch (ValidationException e) {
	// TODO Auto-generated catch block
	System.out.println("Validation Exception Occured");
	
	
	
	
	
	
	
	
	try {
		this.firstName = new StringValidator(firstName);
		this.firstName.lengthFewer(50);
		this.firstName.lengthGreater(2);
	} catch (ValidationException e) {
		// TODO Auto-generated catch block
		System.out.println("Validation Exception Occured");
	}
	
	try {
		this.lastName = new StringValidator(lastName);
		this.lastName.lengthFewer(50);
		this.lastName.lengthGreater(2);
		
	} catch (ValidationException e) {
		// TODO Auto-generated catch block
		System.out.println("Validation Exception Occured");
	}
	
	try {
		this.age = new IntegerValidator(age);
		this.age.greater(0);
		this.age.less(101);
	} catch (ValidationException e) {
		// TODO Auto-generated catch block
		System.out.println("Validation Exception Occured");
	}
	
	try {
		this.socialSecurityNumber = new IntegerValidator(socialSecurityNumber);
		this.socialSecurityNumber.greater(0);
		this.socialSecurityNumber.less(101);
		this.socialSecurityNumber.even();
	}
		catch (ValidationException e) {
	
		// TODO Auto-generated catch block
		System.out.println("Validation Exception Occured");
	}
}