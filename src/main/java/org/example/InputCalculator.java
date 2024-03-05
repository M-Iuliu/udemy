package org.example;

import java.util.*;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        List<Integer> inputArray = new ArrayList<>();
        boolean condition = true;

        Scanner scanner = new Scanner(System.in);

        while (condition) {
            System.out.println("Enter a number. To exit type a character.");

            String inputLine = scanner.nextLine();

            if (inputLine.matches("\\D")) {
                System.out.println("Exiting!");
                condition = false;
            } else {
                try {
                    int inputNumber = Integer.parseInt(inputLine);

                        inputArray.add(inputNumber);
                } catch (NumberFormatException exception) {
                    System.out.println("Invalid input! Please enter a valid number.");
                }
            }
        }

        OptionalDouble avg = Arrays.stream(inputArray.stream().mapToInt(Integer::intValue).toArray()).average();
        int sum = Arrays.stream(inputArray.stream().mapToInt(Integer::intValue).toArray()).sum();

        System.out.println("Avg: " + avg.orElse(0) + " Sum: " + sum);
    }
}