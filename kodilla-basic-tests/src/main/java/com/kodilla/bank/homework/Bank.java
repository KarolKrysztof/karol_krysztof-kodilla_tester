package com.kodilla.bank.homework;

import static java.lang.Float.NaN;

public class Bank {

    private final CashMachine[] cashMachines;

    public Bank(CashMachine[] cashMachines) {
        this.cashMachines = cashMachines;
    }

    public int getBalance() {
        int sum = 0;
        for (CashMachine cashMachine : cashMachines) {
            sum += cashMachine.getBalance();
        }
        return sum;
    }

    public int getPayOutCount() {
        int count = 0;
        for (CashMachine cashMachine : cashMachines) {
           count += cashMachine.getPayOutCount();
        }
        return count;
    }

    public int getPayInCount() {
        int count = 0;
        for (CashMachine cashMachine : cashMachines) {
            count += cashMachine.getPayInCount();
        }
        return count;
    }

    public int getPayOutSum() {
        int sum = 0;
        for (CashMachine cashMachine : cashMachines) {
            sum += cashMachine.getPayOutSum();
        }
        return sum;
    }

    public int getPayInSum() {
        int sum = 0;
        for (CashMachine cashMachine : cashMachines) {
            sum += cashMachine.getPayInSum();
        }
        return sum;
    }

    public double getPayOutAverage() {
        if (getPayInCount() == 0) {
            return 0;
        }
        return ((double) getPayOutSum()) / getPayOutCount();
    }

    public double getPayInAverage() {
        if (getPayInCount() == 0) {
            return 0;
        }
        return ((double) getPayInSum()) / getPayInCount();
    }

}
