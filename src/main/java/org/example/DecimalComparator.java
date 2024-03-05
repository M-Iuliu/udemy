package org.example;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstParam, double secondParam){
        boolean areEqualByThreeDecimalPlaces = true;

        String first = String.format("%.4f", firstParam);
        first = first.substring(0, first.length() - 1);

        String second  = String.format("%.4f", secondParam);
        second = second.substring(0, second.length() - 1);


        if(Double. parseDouble(first) !=   Double. parseDouble(second)) {
            areEqualByThreeDecimalPlaces = false;
        }

        return areEqualByThreeDecimalPlaces;
    }

}
