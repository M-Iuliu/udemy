package org.oca.javaBasics_1.classStructure.Enum;

enum Animal {
    DOG("whoof"), CAT ("MIAW"), FISH("BOUBLE");

    String sound;

     Animal(String sound){
         this.sound = sound;
     }

}

public class TestEnum {
    static Animal a;
    public enum Days { Mon, Thu, Wed};
    public static void main(String[] args) {
        System.out.println( a.DOG.sound + " " + a.FISH.sound);

        Days[] d = Days.values();
        System.out.println(d[2]);
    }
}


abstract class  A {

}

final class  B {

}


class  C {

}
