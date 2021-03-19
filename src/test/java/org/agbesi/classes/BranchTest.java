package org.agbesi.classes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BranchTest {
    Branch branch;

    @Before
    public void setUp() throws Exception {
//        Initializes a new branch nam ecalled Kumasi and adds new customer (Manuel) who makes an initial transaction of
//        700.0
            branch = new Branch("Kumasi");
            branch.newCustomer("Manuel", 700.00);
        }

    @Test
    public void getName() {
        //this method gets the name of the branch object and checks to see if it is "Kumasi Branch"
        assertEquals("Kumasi", branch.getName());
        //this method retrieves the name of the customer object and checks to see if it is "Adelaide" which is not
        assertNotEquals("Adelaide", branch.getName());
    }

    @Test
    public void getCustomers() {
        //this method get the name of the branch object and checks to see if it is "Manuel"
        assertEquals("Manuel", branch.getCustomers().get(0).getName());
//        here the method validates if the customer name is Jefferson
        assertNotEquals("Jefferson", branch.getCustomers().get(0));
    }

    @Test
    public void newCustomer() {
//        It successfully adds a new customer called Johnson with an initial transaction of 500.0
        assertTrue(branch.newCustomer("Johnson", 500.00));
    }

    @Test
    public void addCustomerTransaction() {
        //This method allows Manuel to add a transaction of 700.00
        assertTrue(branch.addCustomerTransaction("Manuel",700.00));

        // This method will not allow Yaw to deposit money because he is not a listed customer
        assertFalse(branch.addCustomerTransaction("Yaw",200.00));
    }

}