class UserAccount {
    // Private fields
    private String username;
    private String password;

    // Constructor
    public UserAccount(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getter methods
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

class SecurityValidator {

    // Method to validate password
    public boolean isValid(UserAccount user) {
        String password = user.getPassword();

        // Check minimum length
        if (password.length() < 8) {
            return false;
        }

        boolean hasDigit = false;
        boolean hasUppercase = false;

        // Check each character
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isDigit(ch)) {
                hasDigit = true;
            }

            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            }
        }

        // Final result
        return hasDigit && hasUppercase;
    }
}

public class PassValidator {
    public static void main(String[] args) {

        // Create object
        UserAccount user = new UserAccount("Naitik","Passed123");

        // Validator object
        SecurityValidator validator = new SecurityValidator();

        // Check password
        if (validator.isValid(user)) {
            System.out.println("Username: " + user.getUsername());
            System.out.println("Password: " + user.getPassword());
            System.out.println("Password is VALID");
        } else {
            System.out.println("Username: " + user.getUsername());
            System.out.println("Password: " + user.getPassword());
            System.out.println("Password is INVALID");
        }
    }
}