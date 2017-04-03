/**
 * Created by wit on 4/3/17.
 */
public interface BankAccountDao {

    int createBankAccount(BankAccountDetails bankAccountDetail);
    void subtractFromAccount(int bankAccountId, int amount);

}
