package com.kodilla.abstracts.baisc_asseration;

public class Application {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Calculator calculator1 = new Calculator();

        int a = 8;
        int b = 5;

        int sumResult = calculator.sum(a, b);

        boolean correct = ResultChecker.assertEquals(13, sumResult);


        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb"+ " " + a + " " + "i" + " " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb"+ " " + " " + a + " " + "i" + " " + b);
        }

        int subtractResult = calculator1.subtract(a, b);

        boolean correct1 = ResultChecker.assertEquals(3, subtractResult);

        if (correct1) {
            System.out.println("Metoda różnicy działa poprawnie dla liczb" + " " + a + " " + "i" + " " + b);
        } else {
            System.out.println("Metoda różnicy nie działa poprawnie dla liczb" + " " + a + " " + "i" + " " + b);
        }

        int sqrtResult = calculator.sqrt(a);

        boolean correct2 = ResultChecker.assertEquals(56, sqrtResult);

        if (correct2) {
            System.out.println("Metoda podnosząca do kwadratu działała poprawnie dla liczby" + " " + a);
        } else {
            System.out.println("Metoda podnoszenia do kwadratu nie działa poprawnie dla liczby" + " " + a);
        }

    }
}
