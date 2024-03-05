package org.example;

public class LeapYear {

    public static boolean isLeapYear(int year){
        boolean isLeapYear = false;

        if(year >=1 && year<9999) {

         if (year % 400 == 0)
            return true;

        if (year % 100 == 0)
            return false;


        if (year % 4 == 0)
            return true;

        }

        return isLeapYear;
    }

    public static int getDaysInMonth(int month, int year){
        boolean isLeapYear = isLeapYear(year);
        int days;

        if (month < 0 || month > 12 || year < 0 || year > 9999) {
            days = -1;
        } else {
            days = switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 4, 6, 9, 11 -> 30;
                case 2 -> isLeapYear ? 29 : 28;
                default -> -1;
            };
        }

        return days;
    }

}
