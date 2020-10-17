package com.kodilla.bank.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BankTestSuite {

    @Test
    public void shouldReturnCorrectSum() {
        // given:
        Bank bank =  initBank();
        int expected = 300;

        // when:
        int result = bank.getBalance();

        // then:
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void shouldReturnCorrectSumWhenEmptyBank() {
        // given:
        Bank bank =  new Bank(new CashMachine[]{});
        int expected = 0;

        // when:
        int result = bank.getBalance();

        // then:
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void shouldReturnCorrectSumWhenBankWithEmptyCashMachine() {
        // given:
        Bank bank =  new Bank(new CashMachine[]{new CashMachine()});
        int expected = 0;

        // when:
        int result = bank.getBalance();

        // then:
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void shouldReturnCorrectPayOutCount() {
        // given:
        Bank bank =  initBank();
        int expected = 2;

        // when:
        int result = bank.getPayOutCount();

        // then:
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void shouldReturnCorrectPayOutCountWhenEmptyBank() {
        // given:
        Bank bank =  new Bank(new CashMachine[]{});
        int expected = 0;

        // when:
        int result = bank.getPayOutCount();

        // then:
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void shouldReturnCorrectPayOutCountWhenBankWithEmptyCashMachine() {
        // given:
        Bank bank =  new Bank(new CashMachine[]{new CashMachine()});
        int expected = 0;

        // when:
        int result = bank.getPayOutCount();

        // then:
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void shouldReturnCorrectPayInCount() {
        // given:
        Bank bank =  initBank();
        int expected = 2;

        // when:
        int result = bank.getPayInCount();

        // then:
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void shouldReturnCorrectPayInCountWhenEmptyBank() {
        // given:
        Bank bank =  new Bank(new CashMachine[]{});
        int expected = 0;

        // when:
        int result = bank.getPayInCount();

        // then:
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void shouldReturnCorrectPayInCountWhenBankWithEmptyCashMachine() {
        // given:
        Bank bank =  new Bank(new CashMachine[]{new CashMachine()});
        int expected = 0;

        // when:
        int result = bank.getPayInCount();

        // then:
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void shouldReturnCorrectPayOutAverage() {
        // given:
        Bank bank =  initBank();
        double expected = 200;

        // when:
        double result = bank.getPayOutAverage();

        // then:
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void shouldReturnCorrectPayOutAverageWhenEmptyBank() {
        // given:
        Bank bank =  new Bank(new CashMachine[]{});
        double expected = 0;

        // when:
        double result = bank.getPayOutAverage();

        // then:
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void shouldReturnCorrectPayOutAverageWhenBankWithEmptyCashMachine() {
        // given:
        Bank bank = new Bank(new CashMachine[]{new CashMachine()});
        double expected = 0;

        // when:
        double result = bank.getPayOutAverage();

        // then:
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void shouldReturnCorrectPayInAverage() {
        // given:
        Bank bank =  initBank();
        double expected = 350;

        // when:
        double result = bank.getPayInAverage();

        // then:
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void shouldReturnCorrectPayInAverageWhenEmptyBank() {
        // given:
        Bank bank =  new Bank(new CashMachine[]{});
        double expected = 0;

        // when:
        double result = bank.getPayInAverage();

        // then:
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void shouldReturnCorrectPayInAverageWhenBankWithEmptyCashMachine() {
        // given:
        Bank bank = new Bank(new CashMachine[]{new CashMachine()});
        double expected = 0;

        // when:
        double result = bank.getPayInAverage();

        // then:
        Assertions.assertEquals(expected, result);
    }

    private Bank initBank() {
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        cashMachine1.add(500);
        cashMachine1.add(-100);

        cashMachine2.add(200);
        cashMachine2.add(-300);

        Bank bank = new Bank(new CashMachine[]{cashMachine1, cashMachine2});
        return bank;
    }

}
