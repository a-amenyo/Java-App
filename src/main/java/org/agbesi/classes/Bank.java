package org.agbesi.classes;

import org.agbesi.interfaces.IBank;

import java.util.ArrayList;

public class Bank implements IBank {
    private String name;
    private ArrayList<Branch> branches;


    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    @Override
    public boolean addBranch( String branchName ){
        //  check if customer already exists , branch without names can also not be added
        if(findBranch(branchName)==null && !branchName.equals("")){
//     new branch object with branch name created
            Branch branch = new Branch(branchName);

//            add the branch to the branches field and return true
            this.branches.add(branch);
            return true;
        }
        else return false;
    }
    @Override
    public boolean addCustomer ( String branchName, String customerName, double initialTransaction){
        //  check if the branch exists
        if(findBranch(branchName) != null){
//            add the customer to the branch and return true
//            if the customer already exists newCustomer() would return false
            return findBranch(branchName).newCustomer(customerName, initialTransaction);
        }
//        otherwise branch does not exist return false
        else return false;

    }
    @Override
     public boolean addCustomerTransaction (String branchName, String customerName,double transaction){
        //        check if the branch exists
        if(findBranch(branchName) != null){
            return findBranch(branchName).addCustomerTransaction(customerName, transaction);
        }
//        if branch does not exist return false
        else return false;
     }

     private Branch findBranch ( String branchName){
         //  loops through the branches array list
         for(Branch branch: this.branches){
             if(branch.getName().equalsIgnoreCase(branchName)){
//                return the branch object if the name matches
                 return branch;
             }
         }
//        otherwise return null
         return null;
     }

     @Override
     public boolean  listCustomers(String branchName, boolean printTransactions){
        //        check if branch exists
        if(findBranch(branchName) != null){
            Branch branch = findBranch(branchName);
            System.out.print("Customer details for branch " + branchName);
            // check if printTransactions is true
            if(printTransactions){

                for(Customer customer: branch.getCustomers()){
                    System.out.printf("\nCustomer: %s[%d]", customer.getName(), branch.getCustomers().indexOf(customer)+1);
                    System.out.print("\nTransactions");
                    for(int i = 0; i < customer.getTransactions().size(); i++){
                        System.out.printf("\n[%d] Amount %f", i+1, customer.getTransactions().get(i));
                    }
                }
            }

            else for(Customer customer: branch.getCustomers()) {
                System.out.printf("\nCustomer: %s[%d]", customer.getName(), branch.getCustomers().indexOf(customer)+1);
            }
            return true;
        }
        return false;
     }
}
