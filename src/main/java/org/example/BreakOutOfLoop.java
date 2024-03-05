package org.example;

public class BreakOutOfLoop {

    public static double calculateInterest (double amount, double rate){
        double amountWithInterest = 0;

        for (rate = 0.25; rate <= 10; rate += 0.25){
            amountWithInterest = amount * (rate/100);
            if(rate > 8.5){
                break;
            }
        }

        return amountWithInterest;
    }
}
