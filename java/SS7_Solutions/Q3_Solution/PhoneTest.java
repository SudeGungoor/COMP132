class PhoneTest {
    
    public static void main(String[] args){
        try{
            Phone myPhone = new Phone(null,"1234567890987656");
            System.out.println("Phone class constructed successfully");
        }catch(ValidationException e){
            System.out.println("Validation Exception Occured");
        }
        
        try{
            Phone myPhone = new Phone("Galaxy One","");
            System.out.println("Phone class constructed successfully");
        }catch(ValidationException e){
            System.out.println("Validation Exception Occured");
        }
        
        
        try{
            Phone myPhone = new Phone("Galaxy One","1234567890987656");
            System.out.println("Phone class constructed successfully");
        }catch(ValidationException e){
            System.out.println("Validation Exception Occured");
        }
    }
    
}
