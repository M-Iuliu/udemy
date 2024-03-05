package org.example;

public class BarkingDog {

    public static boolean shouldWakeUp(Boolean barking, int hourOfDay){
        boolean shouldWakeUp = false;
        if(barking) {
            if ((hourOfDay >= 0 && hourOfDay <= 23)  && (hourOfDay < 8 || hourOfDay > 22)) {
                shouldWakeUp = true;
            }
        }
      return shouldWakeUp;
    }

}
