package com.kodilla.parametrized_tests.homework;

import com.sun.jdi.InvalidLineNumberException;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonData {

    static Stream<Arguments> provideWeightAndHeightDataForBMITest() throws InvalidLineNumberException {
        return Stream.of(
                Arguments.of("Very severely underweight", 40, 1.70),
                Arguments.of("Severely underweight", 48, 1.75),
                Arguments.of("Underweight", 55, 1.75),
                Arguments.of("Normal (healthy weight)", 60, 1.75),
                Arguments.of("Overweight", 80, 1.75),
                Arguments.of("Obese Class I (Moderately obese)", 95, 1.75),
                Arguments.of("Obese Class II (Severely obese)", 110, 1.75),
                Arguments.of("Obese Class III (Very severely obese)", 125, 1.75),
                Arguments.of("Obese Class IV (Morbidly obese)", 140, 1.75),
                Arguments.of("Obese Class V (Super obese)", 160, 1.75),
                Arguments.of("Obese Class VI (Hyper obese)", 200, 1.75)
        );
    }

}
