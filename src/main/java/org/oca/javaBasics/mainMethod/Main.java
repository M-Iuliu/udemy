package org.oca.javaBasics.mainMethod;

class A {
    public static void main(String[] args) {
        System.out.println("A");
    }
}

class B {

    public static void main(String[] args) {
        System.out.println("B");
        System.out.println("args");
        System.out.println(args.length);
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("main");
    }
}

 class Alfabet {
    public static void main(String[] args) {
        System.out.println("test");
    }
}
