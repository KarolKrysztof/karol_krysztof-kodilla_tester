package com.kodilla.bank.homework;

public class CashMachine {

    private int[] transactions;
    private int size;

    public CashMachine() {
        this.transactions = new int[0];
    }

    public void add(int value) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(transactions, 0, newTab, 0, transactions.length);
        newTab[this.size -1] = value;
        this.transactions = newTab;
    }

    public int[] getTransactions() {
        return transactions;
    }

    public double getAverage() {
        double sum = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            sum += this.transactions[i];
        }
    return sum/this.transactions.length;
    }

    public int getBalance() {
        return getPayInSum() - getPayOutSum();
    }

    public int getPayOutCount() {
        int count = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            if (transactions[i] < 0) count++;
        }
        return count;
    }

    public int getPayInCount() {
        int count = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            if (transactions[i] < 0) count++;
        }
        return count;
    }

    public int getPayOutSum() {
        int sum = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            if (transactions[i] < 0) sum += this.transactions[i];;
        }
        return -sum;
    }

    public int getPayInSum() {
        int sum = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            if (transactions[i] > 0) sum += this.transactions[i];;
        }
        return sum;
    }

    public double getPayOutAverage() {
        return ((double) getPayOutSum()) / getPayOutCount();
    }

    public double getPayInAverage() {
        return ((double) getPayInSum()) / getPayInCount();
    }

}
