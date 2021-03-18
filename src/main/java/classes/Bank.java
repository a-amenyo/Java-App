package classes;

import interfaces.IBank;

import java.util.ArrayList;

public class Bank implements IBank {
    private String name;
    private ArrayList<Branch> branches;


    public Bank(String name, ArrayList<Branch> branches) {
        this.name = name;
        this.branches = branches;
    }

    @Override
    public boolean addBranch( String branchName ){
        return false;
    }
    @Override
    public boolean addCustomer ( String branchName, String customerName, double initialTransaction){
        return false;

    }
    @Override
     public boolean addCustomerTransaction (String branchName, String customerName,double transaction){
        return false;
     }

     private Branch findBranch ( String branchName){
        return null;
     }
    @Override
     public boolean  listCustomers(String branchName){
        return false;
     }
}
