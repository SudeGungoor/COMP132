package app;

// User-defined Exception class

public class ValidationException extends Exception {

    @Override
    public String getMessage() {
        return "Phone number: Validation Failed"; 
    }
    
}

//Exercise in self-study homework:
//Implement a custom exception class ValidationException. 
//Implement a Phone class that has a constructor with two parameters: name and serialNumber. 
//Throw a ValidationException from class Phone’s constructor if an empty value is passed 
//for either parameters or if the serial number is not exactly 16 digits. 
//Demonstrate this exception class with a test program.