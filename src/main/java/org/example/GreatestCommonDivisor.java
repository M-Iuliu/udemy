package org.example;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
       int getGreatestCommonDivisor = 1;
        int i = 1;

        if(first < 10 || second< 10){
           return -1;
       }

       while(i <= Math.max(first, second)){
           if( (first % i == 0) && (second % i == 0)){
               getGreatestCommonDivisor = i;
           }
           i++;
       }

        return getGreatestCommonDivisor;
    }

}
