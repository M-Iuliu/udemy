package org.example;

public class ConvertInToCm {

    public static double convertToCm (int heightInInches){
        return heightInInches * 2.54;

    }

    public static double convertToCm (int heightInFeet, int heightInInches){
        int totalHeightenInches = heightInFeet * 12 + heightInInches;
       return convertToCm(totalHeightenInches);
    }
}
