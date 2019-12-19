package SampleCode;

/**
 * Custom subclass of the Exception class
 */
public class HackettException extends Exception {

    /**
     * Constructor.
     * Accepts the exception's message
     */
    public HackettException(String message) {
        super(message);
    }

    /**
     * Override of the Exception getMessage method.
     * Returns a customized message.
     */
    @Override
    public String getMessage() {
        return "HackettException Message: " + super.getMessage();
    }

}
