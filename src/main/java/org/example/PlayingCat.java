package org.example;

public class PlayingCat {
    public static Boolean isCatPlaying(Boolean isSummer, int temp){
        boolean isCatPlaying;
        int lowLimit = 25;
        int upperLimit;

        if (isSummer){
            upperLimit = 45;
        } else { upperLimit = 35; }

        isCatPlaying = temp >= lowLimit && temp <= upperLimit;

        return isCatPlaying;
    }

}
