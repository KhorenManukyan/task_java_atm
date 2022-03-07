package common.validator;

import common.exception.InvalidCardException;

/**
 * interface to validate all bank cards
 *
 * @param <T>
 * @author Khoren
 */
public interface Validator<T> {
    /**
     * @param obj
     * @return
     * @throws InvalidCardException
     */
    boolean validate(T obj) throws InvalidCardException;
}
