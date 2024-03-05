package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerExercise {

    public static void printSumOfFiveInputNumbers() {
        List<Integer> inputArray = new ArrayList<Integer>();
        int count = 1;
        Scanner scanner = new Scanner(System.in);

        while (count < 6) {
            boolean validator = false;
            try {
                do {
                    System.out.println("Enter number #" + count);

                    Integer inputNumber = Integer.parseInt(scanner.nextLine());
                    inputNumber = checkValidNumber(inputNumber);
                    inputArray.add(inputNumber);
                    validator = inputNumber >= 0;
                } while (!validator);

                count++;
            } catch (NumberFormatException exception) {
                System.out.println("Invalid number");
            }
        }

        System.out.println("Sum is: " + sumOfInput(inputArray));
    }

    private static int checkValidNumber(Integer inputNumber) {
        if (inputNumber instanceof Integer) {
            return inputNumber;
        } else {
            return -1;
        }
    }

    private static Integer sumOfInput(List<Integer> inputArray) {
        int sum = 0;

        try {
            for (Integer integer : inputArray) {
                if (integer < 0) {
                    sum = -1;
                }
                sum += integer;
            }
        } catch (Exception e) {
            System.out.println("Invalid input");
        }

        return sum;
    }
}
