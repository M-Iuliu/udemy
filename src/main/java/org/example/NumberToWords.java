package org.example;
import java.util.HashMap;
import java.util.Map;

public class NumberToWords {
    private static final Map<Integer, String> myNumberMap = new HashMap<>();

    static {
        myNumberMap.put(0, "Zero");
        myNumberMap.put(1, "One");
        myNumberMap.put(2, "Two");
        myNumberMap.put(3, "Three");
        myNumberMap.put(4, "Four");
        myNumberMap.put(5, "Five");
        myNumberMap.put(6, "Six");
        myNumberMap.put(7, "Seven");
        myNumberMap.put(8, "Eight");
        myNumberMap.put(9, "Nine");
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int reversedNumber = reverse(number);
        int originalDigitCount = getDigitCount(number);
        int reversedDigitCount = getDigitCount(reversedNumber);

        if (number == 0) {
            System.out.println(myNumberMap.get(0));
            return;
        }

        while (reversedNumber > 0) {
            int myDigit = reversedNumber % 10;
            System.out.println(myNumberMap.get(myDigit));
            reversedNumber /= 10;
        }

        for (int i = reversedDigitCount; i < originalDigitCount; i++) {
            System.out.println(myNumberMap.get(0));
        }
    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int myDigit = number % 10;
            reversedNumber = reversedNumber * 10 + myDigit;
            number /= 10;
        }
        return reversedNumber;
    }

    public static int getDigitCount(int n) {
        if (n < 0) {
            return -1;
        }

        // Special case for number 0
        if (n == 0) {
            return 1;
        }

        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

}

