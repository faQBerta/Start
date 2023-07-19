package validator.entities;

public class PasswordValidator {

    public boolean longMin(String password) {
        return (8 < password.length() || password.length() < 16);
    }

    public boolean specialChar(String password) {
        return (password.contains("@") || password.contains("$") || password.contains("%") || password.contains("#") || password.contains("&"));
    }

    public boolean contMayus(String password) {
        return !(password.equals(password.toLowerCase()));
    }
    
    public boolean isValid(String password) {
        return (specialChar(password) && contMayus(password) && longMin(password));
    }

}
