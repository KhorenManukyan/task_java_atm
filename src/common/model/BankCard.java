package common.model;

import bank.Bank;

import java.util.Date;

/**
 * The class describes the card
 *
 * @author Khoren
 */
public class BankCard implements Card {

    private String cardHolder;
    private String pan;
    private String expirationDate;
    private CardType cardType;
    private Bank owner;

    /**
     * crete constructor to have all fields
     *
     * @param cardHolder
     * @param pan
     * @param expirationDate
     * @param cardType
     * @param owner
     */
    public BankCard(String cardHolder, String pan, String expirationDate, CardType cardType, Bank owner) {
        this.cardHolder = cardHolder;
        this.pan = pan;
        this.expirationDate = expirationDate;
        this.cardType = cardType;
        this.owner = owner;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public Bank getOwner() {
        return owner;
    }

    public void setOwner(Bank owner) {
        this.owner = owner;
    }

    /**
     * @return
     */
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    /**
     * @param obj
     * @return
     */
    public boolean equals(BankCard obj) {
        return this.pan.equals(obj.getPan());
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return super.toString();
    }

}
