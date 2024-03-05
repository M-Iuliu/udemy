package org.example;

public class FactorPrinter {

    public static void printFactors(int number){
         if (number < 0){
            System.out.println("Invalid Value");
        }

        for(int i = number; i >= 1; i--){
            if(number % i == 0){
                System.out.println(number / i);
            }
        }
    }

}
