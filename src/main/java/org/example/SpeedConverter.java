package org.example;

public class SpeedConverter {

    public static long toMilesPerHour (double kilometersPerHour){
        long milesPerHour = -1;
        if(kilometersPerHour >= 0){
            milesPerHour = Math.round((kilometersPerHour / 1.609));
        }

        return milesPerHour;

    }

    public static void printConversion (double kilometersPerHour){
        if(kilometersPerHour >= 0){
            System.out.println(kilometersPerHour + " km/h= " + toMilesPerHour(kilometersPerHour) +" mi/h");
        } else {
            System.out.println("Invalid Value");
        }
    }

}
