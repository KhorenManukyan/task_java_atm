package arca;

import common.model.Card;

/**
 * @param <T>
 * @author Khoren
 */
public interface Processing<T extends Card> {
    /**
     * @param card
     * @param sum
     * @throws Exception
     */
    void processTransaction(T card, int sum) throws Exception;
}
