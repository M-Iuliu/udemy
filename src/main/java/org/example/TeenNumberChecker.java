package org.example;

import java.util.ArrayList;
import java.util.List;

public class TeenNumberChecker {

    public static boolean hasTeen (int nr1, int nr2, int nr3){
        boolean hasTeen = false;
        List<Integer> myAgeList = new ArrayList<>();

        myAgeList.add(nr1);
        myAgeList.add(nr2);
        myAgeList.add(nr3);

        for (Integer age : myAgeList){
            if (age >= 13 && age <= 19) {
                hasTeen = true;
                break;
            }
        }

        return hasTeen;
    }



}
