package lab3;

/**
 *
 * @author dbarter1
 */
public class IllegalStringLengthException extends IllegalArgumentException{
    private static final String MESSAGE = "Input length invalid";

    public IllegalStringLengthException() {
        super(MESSAGE);
    }

    public IllegalStringLengthException(String s) {
        super(MESSAGE);
    }

    public IllegalStringLengthException(String message, Throwable cause) {
        super(MESSAGE, cause);
    }

    public IllegalStringLengthException(Throwable cause) {
        super(cause);
    }
    
    
}
