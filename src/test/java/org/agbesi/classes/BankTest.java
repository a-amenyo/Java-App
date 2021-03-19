package org.agbesi.classes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BankTest {
    private Bank bank;

    @Before
    public void setUp() throws Exception {
        bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Tim", 50.05);


        bank.addCustomerTransaction("Adelaide","Tim", 44.22);

        bank.listCustomers("Adelaide", true);


    }

    @Test
    public void addBranch() {

        assertTrue(bank.addBranch("Accra"));

        assertFalse(bank.addBranch("Adelaide"));
    }

    @Test
    public void addCustomer() {

        assertTrue(bank.addCustomer("Adelaide", "Jean", 200.00));

        assertFalse(bank.addCustomer("Adelaide", "Tim", 50.05));
    }

    @Test
    public void addCustomerTransaction() {

        assertTrue(bank.addCustomerTransaction("Adelaide", "Tim", 54.22));

        assertFalse(bank.addCustomerTransaction("Accra","Tom", 44.22));

    }

    @Test
    public void listCustomers() {
        // This method is used to list the customers that exits in a particular branch
        assertTrue(bank.listCustomers("Adelaide", true));
        // This method shows a branch that does not exit should return false
        assertFalse(bank.listCustomers("Aya Napa", false ));
    }
}