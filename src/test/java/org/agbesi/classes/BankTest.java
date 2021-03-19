package org.agbesi.classes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BankTest {
    private Bank bank;

    @Before
    public void setUp() throws Exception {
        // Instantiating a bank class
        bank = new Bank("National Australia Bank");

        // Adds a  new branch called Adelaide to National Australia Bank
        bank.addBranch("Adelaide");

        // Adds a  new customer called Tim to National Australia Bank
        bank.addCustomer("Adelaide", "Tim", 50.05);

//        This adds a new customer transaction of 44.22 to Tims account
        bank.addCustomerTransaction("Adelaide","Tim", 44.22);

//        Lists all customers in the Adelaide branch
        bank.listCustomers("Adelaide", true);


    }

    @Test
    public void addBranch() {

        // This method  adds a new branch and return true
        assertTrue(bank.addBranch("Accra"));
        // this method should not be able to add new branch and return false because the branch exists already
        assertFalse(bank.addBranch("Adelaide"));
    }

    @Test
    public void addCustomer() {
        // This method should be able to add new Customer successfully
        assertTrue(bank.addCustomer("Adelaide", "Jean", 200.00));
        //  This method should return false since a Customer already exits
        assertFalse(bank.addCustomer("Adelaide", "Tim", 50.05));
    }

    @Test
    public void addCustomerTransaction() {

        // This method should be able to add new branch and return true
        assertTrue(bank.addCustomerTransaction("Adelaide", "Tim", 54.22));
        // this method should not be able to add new branch. it must return false because it already exists
        assertFalse(bank.addCustomerTransaction("Accra","Tom", 44.22));

    }

    @Test
    public void listCustomers() {
        // This method is used to list the customers that exits in the Adelaide branch
        assertTrue(bank.listCustomers("Adelaide", true));
        // This method shows a branch that does not exit should return false
        assertFalse(bank.listCustomers("Aya Napa", false ));
    }
}