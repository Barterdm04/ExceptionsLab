package lab3;

/**
 *
 * @author dbarter1
 */
public class IllegalNameFormatException extends IllegalArgumentException{
    private static final String MESSAGE = "Only first and last name allowed, both required";

    public IllegalNameFormatException() {
        super(MESSAGE);
    }

    public IllegalNameFormatException(String s) {
        super(MESSAGE);
    }

    public IllegalNameFormatException(String message, Throwable cause) {
        super(MESSAGE, cause);
    }

    public IllegalNameFormatException(Throwable cause) {
        super(cause);
    }
    
    
}
