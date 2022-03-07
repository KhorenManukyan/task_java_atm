package bank;

/**
 * @author Khoren
 */
public class Account {
    private String accountOwner;
    private String accountNumber;
    private long balance;
    private Bank owner;
    private Status status;

    /**
     * @param accountOwner
     * @param accountNumber
     * @param balance
     * @param owner
     */
    public Account(String accountOwner, String accountNumber, long balance, Bank owner) {
        this.accountOwner = accountOwner;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
        this.status = Status.ACTIVE;
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public Bank getOwner() {
        return owner;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
