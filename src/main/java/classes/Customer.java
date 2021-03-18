package classes;

import interfaces.ICustomer;

import java.util.ArrayList;

public class Customer implements ICustomer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialTransaction) {
        this.name = name;
        this.transactions = new ArrayList<>();
        this.transactions.add(initialTransaction);
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
    public void addTransaction ( double transactions){

    }



}
