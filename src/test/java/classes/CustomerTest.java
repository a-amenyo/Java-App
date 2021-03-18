package classes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {
    Customer customer;

    @Before
    public void setUp() throws Exception {
        customer = new Customer("Agbesi", 2500.00 );
    }

    @Test
    public void getName() {
        //this method get the name of the customer object and checks to see if it is "Jedy"
        assertEquals("Agbesi", customer.getName());
        //this method get the name of the customer object and checks to see if it is "Jefferson" which is not
        assertNotEquals("Victor", customer.getName());
    }

    @Test
    public void getTransactions() {
        //this method get the amount in the transaction
        assertEquals(2500.00, customer.getTransactions().get(0), 0.0);
        // this method checks if the amount in the transaction matches
        assertNotEquals(150.00, customer.getTransactions().get(0), 0.0);
    }

    @Test
    public void addTransaction() {
        // adding new transaction
        customer.addTransaction(400.00);
        //checking the transactions added
        assertEquals(2, customer.getTransactions().size());
    }
}