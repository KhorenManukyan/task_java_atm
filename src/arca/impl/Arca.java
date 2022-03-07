package arca.impl;

import arca.Processing;
import common.exception.ArcaException;
import common.exception.BankException;
import common.exception.InvalidCardException;
import common.model.BankCard;
import common.validator.Validator;
import common.validator.impl.CardValidator;


/**
 * @author Khoren
 */
public class Arca implements Processing<BankCard> {
    private Validator validator;

    /**
     * default constructor Arca class
     */
    public Arca() {
        this.validator = new CardValidator();
    }


    /**
     * @param card
     * @param sum
     * @throws ArcaException
     */
    @Override
    public void processTransaction(BankCard card, int sum) throws ArcaException {
        try {
            validator.validate(card);
            card.getOwner().processTransactionBank(card, sum);
        } catch (InvalidCardException | BankException e) {
            e.printStackTrace();
            throw new ArcaException(e.getMessage());
        }
    }
}
