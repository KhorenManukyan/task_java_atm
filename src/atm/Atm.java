package atm;

import arca.Processing;
import arca.impl.Arca;
import common.exception.AtmException;
import common.exception.InvalidCardException;
import common.model.BankCard;
import common.validator.Validator;
import common.validator.impl.CardValidator;

/**
 * This is the ATM class
 *
 * @author Khoren
 */
public class Atm {
    private BankCard currentCurd; //to store a variable card
    private long balance;// all balance in ATM
    private Validator validator;
    private Processing processingCenter;

    /**
     * Constructs default constructor ATM by default money
     */
    public Atm() {
        this.balance = 5_000_000;
        this.validator = new CardValidator();
        this.processingCenter = new Arca();
    }

    /**
     * method that checks whether there is a bankcard in the ATM or not
     * <p>
     * validate bankcard, if card is valid
     * else throw new AtmException("Invalid bankcard")
     *
     * @param bankCard Checks bankCard
     * @throws AtmException invalid bankcard
     */
    public void addCard(BankCard bankCard) throws AtmException {
        if (currentCurd == null) {
            // validate card
            try {
                validator.validate(bankCard);
                currentCurd = bankCard;
            } catch (InvalidCardException e) {
                e.printStackTrace();
                throw new AtmException(e.getMessage());
            }
        } else {
            throw new AtmException("ATM already has a card");
        }
    }

    /**
     * if ATM balance >= sum and currentCurd != null call to arca(currentCurd, sum)
     * else throw new AtmException("request denied")
     * <p>
     * if ok will give the money and will return the card
     *
     * @param sum the amount entered
     * @throws AtmException
     */
    public void withdrawMoney(int sum) throws AtmException {
        if (balance >= sum && currentCurd != null) {
            try {
                processingCenter.processTransaction(currentCurd, sum);
                balance -= sum;
                currentCurd = null;
            } catch (Exception e) {
                e.printStackTrace();
                throw new AtmException(e.getMessage());
            }

        } else {
            throw new AtmException("request denied");
        }
    }

    /**
     * The private method where added the money in the ATM
     *
     * @param sum the amount entered
     */
    private void updateBalance(long sum) {
        balance += sum;
    }
}
