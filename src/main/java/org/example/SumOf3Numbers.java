package org.example;

public class SumOf3Numbers {

    public static boolean hasEqualSum (Integer nr1, Integer nr2, Integer nr3){
       boolean isEqual = false;
        int sum = nr1 + nr2;
        if(sum == nr3){
            isEqual = true;
        }

        return isEqual;
    }

}
