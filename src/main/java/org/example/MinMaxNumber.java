package org.example;

import java.util.*;

public class MinMaxNumber {

    public static void storeMinMax (){
        List<Integer> inputArray = new ArrayList<Integer>();
        boolean condition = true;

        Scanner scanner = new Scanner(System.in);

        while (condition){

            boolean validator = false;
            try {
                do {
                    System.out.println("Enter a number. To exit type a character.");

                    int inputNumber = Integer.parseInt(scanner.nextLine());
                    inputNumber = checkValidNumber(inputNumber);
                    inputArray.add(inputNumber);
                    validator = inputNumber >= 0;
                } while (!validator);

            } catch (NumberFormatException exception) {
                System.out.println("Exiting!");
                condition = false;
            }
        }

        OptionalInt min = Arrays.stream(inputArray.stream().mapToInt(Integer::intValue).toArray()).min();
        OptionalInt max = Arrays.stream(inputArray.stream().mapToInt(Integer::intValue).toArray()).max();

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }

    private static int checkValidNumber(Integer inputNumber) {
        if (inputNumber instanceof Integer) {
            return inputNumber;
        } else {
            return -1;
        }
    }

}
