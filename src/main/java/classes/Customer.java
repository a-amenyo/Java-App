package classes;

import interfaces.ICustomer;

import java.util.ArrayList;

public class Customer implements ICustomer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialTransaction) {
        //        set initial transaction to 0 if the value provided is negative
        initialTransaction = initialTransaction < 0 ? 0 : initialTransaction;
//        empty strings should not be allowed to be used as customer names
        if (!name.equals("")) {
            this.name = name;
//            instantiate the transactions arrayList
            this.transactions = new ArrayList<>();
//            add the initialTransaction to the arrayList
            this.transactions.add(initialTransaction);
        }
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    @Override
    public void addTransaction ( double transaction){
        if (transaction >= 0) {
            this.transactions.add(transaction);
        }

    }



}
