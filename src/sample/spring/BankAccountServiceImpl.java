package sample.spring;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wit on 4/3/17.
 */
@Service(value = "sample.spring.BankAccountService")
public class BankAccountServiceImpl implements BankAccountService {

    private static Logger logger = Logger.getLogger(BankAccountServiceImpl.class);
    static {
        org.apache.log4j.BasicConfigurator.configure();
    }
    private final BankAccountDao bankAccountDao;

    @Autowired
    public BankAccountServiceImpl(BankAccountDao bankAccountDao) {
        this.bankAccountDao = bankAccountDao;
    }

    @Override
    public int createBankAccount(BankAccountDetails bankAccountDetails) {
        logger.info("createBankAccount method invoked");
        return bankAccountDao.createBankAccount(bankAccountDetails);
    }
}
