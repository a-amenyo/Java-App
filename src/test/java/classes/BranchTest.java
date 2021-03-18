package classes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BranchTest {
    Branch branch;

    @Before
    public void setUp() throws Exception {
            branch = new Branch("Kumasi");
            branch.newCustomer("Manuel", 700.00);
        }

    @Test
    public void getName() {
        //this method get the name of the branch object and checks to see if it is "Kumasi Branch"
        assertEquals("Kumasi", branch.getName());
        //this method get the name of the customer object and checks to see if it is "London Branch" which is not
        assertNotEquals("Adelaide", branch.getName());
    }

    @Test
    public void getCustomers() {

        assertEquals("Manuel", branch.getCustomers().get(0).getName());
        assertNotEquals("Jefferson", branch.getCustomers().get(0));
    }

    @Test
    public void newCustomer() {
        assertTrue(branch.newCustomer("Johnson", 500.00));
    }

    @Test
    public void addCustomerTransaction() {

        assertTrue(branch.addCustomerTransaction("Manuel",700.00));

        assertFalse(branch.addCustomerTransaction("Yaw",200.00));
    }

}