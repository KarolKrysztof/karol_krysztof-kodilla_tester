package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserValidatorTestSuite {

    UserValidator userNameValidator = new UserValidator();

    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnFalseIfStringIsEmpty(String text) {
        System.out.println("|" + text + "|");
        assertFalse(userNameValidator.validateUsername(text));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Ka", "."})
    public void shouldReturnFalseIfStringIsShorterThanThreeChar(String text) {
        assertFalse(userNameValidator.validateUsername(text));
    }

    @ParameterizedTest
    @ValueSource(strings = {"KA%", "rol!i", "FFF?/", "'Baron", "JpK@", "#007", "C&I"})
    public void shouldReturnFalseIfStringIsContainInvalidChar(String text) {
        assertFalse(userNameValidator.validateUsername(text));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Kar", "magda84_", "gg8", ".86", "___", "..."})
    public void shouldReturnTrueIfStringIsCorrect(String text) {
        assertTrue(userNameValidator.validateUsername(text));
    }

}
