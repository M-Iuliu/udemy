package org.example;

public class YearCalculator {

    public static void printYearsAndDays(long minutes){

        String yearsAndDays;

        if(minutes < 0){
            System.out.println("Invalid Value");
        }

        else {

            long hour = minutes / 60;
            long days = hour / 24;
            long years = days / 365;
            long remainderDays = days % 365;

            yearsAndDays = minutes + " min = " +  years + " y "+ remainderDays + " d";
            System.out.println(yearsAndDays);
        }

    }
}
