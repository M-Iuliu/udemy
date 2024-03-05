package org.example;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes (int kiloBytes){

        int mb_main;
        int mb_remain;

        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            mb_main = kiloBytes /1024;
            mb_remain = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + mb_main + " MB " + mb_remain + " KB");
        }

    }

}
