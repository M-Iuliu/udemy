package org.example;

public class NewSwitch {
// Ex nou
    public static void testSwitch(int impute){
        switch (impute){
            case 1 -> System.out.println("Impute was 1");
            case 2 -> System.out.println("Impute was 2");
            case 3 , 4, 5 -> {
                System.out.println("Impute was 3, 4 or 5");
                System.out.println("Real impute was: " + impute);
            }
            default -> System.out.println("Invalid impute! Type integers from 1-5");
        }
    }

//    Ex nou
    public static String getTrimester(String input){
        return switch (input) {
            case "January", "February", "March", "April" -> "1st";
            case "May", "June", "July", "August" -> "2nd";
            case "September", "October", "November", "December" -> "3rd";
            default -> {
                yield input + " is bad.";
            }
        };

    }


//Vechi
//    public static String getTrimester(String input){
//        switch (input){
//            case "January":
//            case "February":
//            case "March":
//            case "April":
//                return "1st";
//
//            case "May":
//            case "June":
//            case "July":
//            case "August":
//                return "2nd";
//
//            case "September":
//            case "October":
//            case "November":
//            case "December":
//                return "3rd";
//        }
//
//        return "bad input";
//    }

}
