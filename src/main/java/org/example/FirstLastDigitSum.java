package org.example;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int lastDigit = number % 10;
        int firstDigit = 0;

        while (number >= 10) {
            number /= 10;
        }

        firstDigit = number;

        return lastDigit + firstDigit;
    }

}
