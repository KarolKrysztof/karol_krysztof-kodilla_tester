package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class GamblingMachineTestSuite {
    GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/incorrect.csv", delimiter = ':')
    public void shouldThrowExceptionForInvalidNumbers(String testNumbers) {
       Assertions.assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(convertToSet(testNumbers)));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/correct.csv", delimiter = ':')
    public void shouldReturnCorrectNumber(String testNumbers) throws InvalidNumbersException {
        int result = gamblingMachine.howManyWins(convertToSet(testNumbers));
        Assertions.assertTrue(result >= 0 && result <= 6);

    }

    private Set<Integer> convertToSet(String testNumbers) {
        String[] stringNumbers = testNumbers.split(",");
        Set<Integer> result = new HashSet<>();
        for (String stringNumber : stringNumbers) {
            int number = Integer.parseInt(stringNumber.trim());
            result.add(number);
        }
        return result;
    }

}
