package org.example;
import com.google.common.math.IntMath;

public class PrimeNumberCounter {

    public static int primeNumberCount(int input){
        int count = 0;
        if (input > 1000){
            return -1;
        }

        for(int i = 0; i <= input; i++){
            if (IntMath.isPrime(i)){
                count++;
            }
        }

        return count;
    }
}
