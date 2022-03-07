package bank;

import common.exception.BankException;
import common.exception.InvalidCardException;
import common.model.BankCard;
import common.validator.impl.CardValidator;

/*bank@ piti unena account-neri list, amen account-in kcvac e gone mi card, account-@ uni ira balance-@
 * */

/**
 * Bank will have account lists, every account is attached at least one card,
 * account will have balance
 *
 * @author Khoren
 */
public enum Bank {
    HSBC {
        /**
         * @param bankCard
         * @param sum
         * @return
         * @throws BankException
         */
        @Override
        public boolean processTransactionBank(BankCard bankCard, int sum) throws BankException {
            if (bankCard.getOwner().equals(this)) {
                try {
                    getValidator().validate(bankCard);
                } catch (InvalidCardException e) {
                    e.printStackTrace();
                    throw new BankException(e.getMessage());
                }
            }
            return false;
        }
    },
    ACBA {
        /**
         * @param bankCard
         * @param sum
         * @return
         * @throws BankException
         */
        @Override
        public boolean processTransactionBank(BankCard bankCard, int sum) throws BankException {
            if (bankCard.getOwner().equals(this)) {
                try {
                    getValidator().validate(bankCard);
                } catch (InvalidCardException e) {
                    e.printStackTrace();
                    throw new BankException(e.getMessage());
                }
            }
            return false;
        }
    },
    ABB {
        /**
         * @param bankCard
         * @param sum
         * @return
         * @throws BankException
         */
        @Override
        public boolean processTransactionBank(BankCard bankCard, int sum) throws BankException {
            if (bankCard.getOwner().equals(this)) {
                try {
                    getValidator().validate(bankCard);
                } catch (InvalidCardException e) {
                    e.printStackTrace();
                    throw new BankException(e.getMessage());
                }
            }
            return false;
        }
    },
    ID {
        /**
         * @param bankCard
         * @param sum
         * @return
         * @throws BankException
         */
        @Override
        public boolean processTransactionBank(BankCard bankCard, int sum) throws BankException {
            if (bankCard.getOwner().equals(this)) {
                try {
                    getValidator().validate(bankCard);
                } catch (InvalidCardException e) {
                    e.printStackTrace();
                    throw new BankException(e.getMessage());
                }
            }
            return false;
        }
    };

    private CardValidator validator;

    /**
     * default constructor
     */
    Bank() {
        this.validator = new CardValidator();
    }

    public CardValidator getValidator() {
        return validator;
    }


    /**
     * @param bankCard
     * @param sum
     * @return
     * @throws BankException
     */
    public abstract boolean processTransactionBank(BankCard bankCard, int sum) throws BankException;

//    public abstract Account getCardAccount(BankCard bankCard);
}
