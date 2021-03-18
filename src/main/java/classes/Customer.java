package classes;

import interfaces.ICustomer;

import java.util.ArrayList;

public class Customer implements ICustomer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialTransaction) {
        //   set initial transaction to 0 if the value provided is negative
        initialTransaction = initialTransaction < 0 ? 0 : initialTransaction;
        if (!name.equals("")) {
            this.name = name;
            this.transactions = new ArrayList<>();

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
