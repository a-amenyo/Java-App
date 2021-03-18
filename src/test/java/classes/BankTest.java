package classes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BankTest {
    private Bank bank;

    @Before
    public void setUp() throws Exception {
        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Jeff", 175.0);

        bank.addCustomerTransaction("Adelaide","Tim", 44.22);

        bank.listCustomers("Adelaide", true);



    }

    @Test
    public void addBranch() {
    }

    @Test
    public void addCustomer() {
    }

    @Test
    public void addCustomerTransaction() {
    }

    @Test
    public void listCustomers() {
    }
}