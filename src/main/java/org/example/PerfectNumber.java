package org.example;

import java.util.ArrayList;
import java.util.List;

public class PerfectNumber {

    public static boolean isPerfectNumber(int number){
        boolean output = false;
        List<Integer> myArray = new ArrayList<>();
        int sum = 1;

        for(int i = 2; i < number; i++){
            if(number % i == 0) {
                myArray.add(i);
            }
        }

        for( int i = 0; i <= myArray.size() - 1; i++){
            sum = sum + myArray.get(i);
        }

        if(sum == number){
            output = true;
        }

        return output;
    }

}
