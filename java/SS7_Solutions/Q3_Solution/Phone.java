
public class Phone {
    
    private String name;
    private String imei;

    public Phone(String name, String imei) throws ValidationException {
        if (name == null) {
            throw new ValidationException();
        } else if (name.length() == 0) {
            throw new ValidationException();
        } else if (imei == null) {
            throw new ValidationException();
        } else if (imei.length() != 16) {
            throw new ValidationException();
        } else {
            this.name = name;
            this.imei = imei;
        }
    }

}
