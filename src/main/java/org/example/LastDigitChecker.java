package org.example;

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int first, int second, int third){
        int firstDigit = first % 10;
        int secondDigit = second % 10;
        int thirdDigit = third % 10;

        if(first < 10 ||  first > 1000 || second< 10 || second > 1000 || third <10 || third >1000){
            return false;
        }

        return firstDigit == secondDigit || secondDigit == thirdDigit || firstDigit == thirdDigit;
    }

    public static boolean isValid(int number){
        return (number < 10 || number > 1000) ? false : true;
    }

}
