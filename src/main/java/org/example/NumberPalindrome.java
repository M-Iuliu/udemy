package org.example;

public class NumberPalindrome {

    public static Boolean isPalindrome(int number){
        int lastDigit;
        int revers = 0;
        int storedNumber = number;

        while(number != 0){
            lastDigit =  number % 10;
            number = number / 10;

            revers = revers * 10;
            revers += lastDigit;
        }


        return storedNumber == revers;
    }

}
