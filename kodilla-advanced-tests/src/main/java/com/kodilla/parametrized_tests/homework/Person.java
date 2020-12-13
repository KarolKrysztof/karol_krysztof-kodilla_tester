package com.kodilla.parametrized_tests.homework;

public class Person {

    private double heightInMeters;
    private double weightInKilograms;

    public Person(double heightInMeters, double weightInKilograms) {
        this.heightInMeters = heightInMeters;
        this.weightInKilograms = weightInKilograms;
    }

    public String getBMI() {
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        if (bmi < 15) {
            return "Very severely underweight";
        } else if (bmi < 16) {
            return "Severely underweight";
        } else if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal (healthy weight)";
        } else if (bmi < 30) {
            return "Overweight";
        } else if (bmi < 35) {
            return "Obese Class I (Moderately obese)";
        } else if (bmi < 40) {
            return "Obese Class II (Severely obese)";
        } else if (bmi < 45) {
            return "Obese Class III (Very severely obese)";
        } else if (bmi < 50) {
            return "Obese Class IV (Morbidly obese)";
        } else if (bmi < 60) {
            return "Obese Class V (Super obese)";
        }
        return "Obese Class VI (Hyper obese)";
    }

}
