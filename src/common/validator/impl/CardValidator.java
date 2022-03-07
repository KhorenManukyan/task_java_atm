package common.validator.impl;

import common.exception.ExpiredCardException;
import common.exception.InvalidCardException;
import common.exception.InvalidCardHolderException;
import common.exception.InvalidPanException;
import common.model.BankCard;
import common.validator.Validator;


import static common.Constants.*;

/**
 * class CardValidator to validate card fields
 *
 * @author Khoren
 */
public class CardValidator implements Validator<BankCard> {

    /**
     * validate method call three methods to validate card
     *
     * @param obj type BankCard
     * @return if card is valid return true, else trow exception
     * @throws InvalidCardException for three methods
     */
    @Override
    public boolean validate(BankCard obj) throws InvalidCardException {
        try {
            validatePan(obj.getPan());
            validateExpirationDate(obj.getExpirationDate());
            validateCardHolder(obj.getCardHolder());
        } catch (InvalidCardException e) {
            e.printStackTrace();
            throw new InvalidCardException(e.getMessage());
        }

        return false;
    }

    /**
     * @param cardHolder
     * @throws InvalidCardHolderException valid regex ^[a-zA-Z]{4,}(?: [a-zA-Z]+){0,2}$
     */
    private void validateCardHolder(String cardHolder) throws InvalidCardHolderException {
        if (!cardHolder.matches(CARD_HOLDER)) {
            throw new InvalidCardHolderException("invalid cardHolder");
        }
    }

    /**
     * @param expirationDate
     * @throws ExpiredCardException
     */
    private void validateExpirationDate(String expirationDate) throws ExpiredCardException {
        if (!expirationDate.matches(EXPIRATION_DATE_REGEX)) {
            throw new ExpiredCardException("invalid expiration date");
        }
    }

    /**
     * @param pan
     * @throws InvalidPanException valid regex [0-9]{12,16}
     */
    private void validatePan(String pan) throws InvalidPanException {
        if (!pan.matches(PAN_REGEX)) {
            throw new InvalidPanException("Invalid pan");
        }
    }

}
