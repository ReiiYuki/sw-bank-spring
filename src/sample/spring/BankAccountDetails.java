package sample.spring;

import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.util.Date;

/**
 * Created by wit on 4/3/17.
 */
public class BankAccountDetails {
    private int accountId;
    private int balanceAmount;
    private Date lastTransactionTimestamp;

    public Date getLastTransactionTimestamp() {
        return lastTransactionTimestamp;
    }

    public void setLastTransactionTimestamp(Date lastTransactionTimestamp) {
        this.lastTransactionTimestamp = lastTransactionTimestamp;
    }

    public int getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(int balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    @Override
    public String toString() {
        return "sample.spring.BankAccountDetails [accountOd="+accountId+", balanceAmount="+balanceAmount+", lastTransactionTimestamp="+lastTransactionTimestamp+"]";
    }
}
