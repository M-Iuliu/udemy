package org.example;

public class SumOddRange {
    public static boolean isOdd(int number) {
        if (number <= 0) {
            return false;
        }
        return number % 2 != 0; // Check if the number is odd.
    }

    public static int sumOdd(int start, int end) {
        if (start > end || start <= 0 || end <= 0) {
            return -1; // Invalid input
        }

        int sum = 0;

        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }

        return sum;
    }
}