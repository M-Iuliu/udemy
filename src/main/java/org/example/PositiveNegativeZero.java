package org.example;

public class PositiveNegativeZero {
    public static String POSITIVE = "positive";
    public static String NEGATIVE = "negative";
    public static String ZERO = "zero";


    public static void checkNumber (int checkNumber){
        if(checkNumber > 0){
            System.out.println(POSITIVE);
        } else if (checkNumber < 0){
            System.out.println(NEGATIVE);
        } else{
            System.out.println(ZERO);
        }
    }

}
