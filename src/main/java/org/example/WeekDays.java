package org.example;

public class WeekDays {

    public static void getDay(int input){
        String day = switch (input) {
            case 1 -> "Monday";
            case 2-> "Tuesday";
            case 3-> "Wednesday";
            case 4-> "Thursday";
            case 5-> "Friday";
            case 6-> "Saturday";
            case 7-> "Sunday";
            default -> {
                yield input + " out of range";
            }
        };

        System.out.println(day);
    }

}
