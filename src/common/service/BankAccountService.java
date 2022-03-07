package common.service;

import bank.Account;
import bank.Bank;
import common.model.BankCard;

import java.util.Map;
import java.util.Set;

/**
 * @author Khoren
 */
public class BankAccountService {
    /**
     *
     */
    private Map<Bank, Map<BankCard, Account>> x;

    /**
     * @param bank
     * @return
     */
    public Map<BankCard, Account> getCardAccountMap(Bank bank) {
        return x.get(bank);
    }

    /**
     * @return
     */
    public Set<BankCard> getAllBankCards() {
        return null;
    }
}
