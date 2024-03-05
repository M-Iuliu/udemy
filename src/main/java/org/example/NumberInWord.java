package org.example;

public class NumberInWord {

    public static void printNumberInWord(int input){
       String number;

        switch (input) {
            case 1:
                number = "ONE";
                break;
            case 2:
                number = "TWO";
                break;
            case 3:
                number = "THREE";
                break;
            case 4:
                number = "FOUR";
                break;
            case 5:
                number = "FIVE";
                break;
            case 6:
                number = "SIX";
                break;
            case 7:
                number = "SEVEN";
                break;
            case 8:
                number = "EIGHT";
                break;
            case 9:
                number = "NINE";
                break;
            case 0:
                number = "ZERO";
                break;
            default:
                number = "OTHER";
                break;
        }

        System.out.println(number);
    }

}
