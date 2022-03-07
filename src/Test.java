import atm.Atm;
import common.exception.AtmException;
import common.model.BankCard;
import common.service.BankAccountService;

public class Test {
    public static void main(String[] args) {
        BankAccountService bag = new BankAccountService();
        Atm atm = new Atm();

        for (BankCard bc : bag.getAllBankCards()) {
            try {
                atm.addCard(bc);
                atm.withdrawMoney(1000);
            } catch (AtmException e) {
                e.printStackTrace();
            }
        }
    }
}
