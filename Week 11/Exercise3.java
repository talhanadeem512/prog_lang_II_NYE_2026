class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}

class Validator {
    public void checkPassword(String pwd) throws InvalidPasswordException {
        if (pwd == null || pwd.length() < 8) {
            throw new InvalidPasswordException("Invalid Password: Must be at least 8 characters.");
        }
        System.out.println("Password is secure!");
    }
}

public class Exercise3 {
    public static void main(String[] args) {
        Validator validator = new Validator();

        try {
            validator.checkPassword("abc123");
        } catch (InvalidPasswordException e) {
            System.out.println("Security Error: " + e.getMessage());
        }
    }
}