package org.agbesi.classes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {
    Customer customer;

    @Before
    public void setUp() throws Exception {
//        Initializing aa new deposit of 2500.0 made by Agbesi
        customer = new Customer("Agbesi", 2500.00 );
    }

    @Test
    public void getName() {

//        returns the name of the customer in the object which is Agbesi
        assertEquals("Agbesi", customer.getName());
//        //this method gets the name of the branch object and checks to see if it is "Victor" which is false
        assertNotEquals("Victor", customer.getName());
    }

    @Test
    public void getTransactions() {
        //this method returns a list of transactions that have been made
        assertEquals(2500.00, customer.getTransactions().get(0), 0.0);
        // this method checks to see if the list of transactions have a value of 150.0
        assertNotEquals(150.00, customer.getTransactions().get(0), 0.0);
    }

    @Test
    public void addTransaction() {
        // adding new transaction of 400.0
        customer.addTransaction(400.00);
        //checking the transactions added successfully
        assertEquals(2, customer.getTransactions().size());
    }
}