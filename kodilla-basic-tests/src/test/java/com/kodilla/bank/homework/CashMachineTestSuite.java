package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine();
        int[] values = cashMachine.getTransactions();
        assertEquals(0, values.length);
    }

    @Test
    public void shouldAddTwoElementsToArray() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(50);
        cashMachine.add(300);

        int[] values = cashMachine.getTransactions();
        assertEquals(2, values.length);
        assertEquals(50, values[0]);
        assertEquals(300, values[1]);
    }
}
