package common;

/**
 * class where are the constants
 *
 * @author Khoren
 */
public class Constants {
    public static final String PAN_REGEX = "[0-9]{12,16}";
    public static final String EXPIRATION_DATE_REGEX = "^\\d{4}-\\d{2}-\\d{2}$";
    public static final String CARD_HOLDER = "^[a-zA-Z]{4,}(?: [a-zA-Z]+){0,2}$";

}
