public class ValidationException extends Exception{

    @Override
    public String getMessage() {
        return "Validation Failed"; 
    }
    
}
