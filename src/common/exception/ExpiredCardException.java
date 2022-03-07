package common.exception;

/**
 * @author Khoren
 */
public class ExpiredCardException extends InvalidCardException {
    /**
     * @param message
     */
    public ExpiredCardException(String message) {
        super(message);
    }
}
