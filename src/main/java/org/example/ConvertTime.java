package org.example;

public class ConvertTime {
    public static String  convertTime(int seconds) {
        int min = seconds / 60;
        int sec = (seconds % 60);

        return convertTime(min, sec);
    }

     public static String convertTime(int minutes , int seconds) {
         String message;
         int hours = minutes / 60;
         int min = minutes % 60;

         if(seconds < 0 || seconds >= 59) {
             message = "Error! Seconds must be between 0 - 59 interval.";
         }else if(minutes < 0){
             message = "Error! Minutes must be positive.";
         }else{
             message = "h:" + hours + " m:" + min + " s:" + seconds;
         }

         return message;
     }

}
