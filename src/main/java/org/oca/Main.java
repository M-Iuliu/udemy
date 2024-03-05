package org.oca;

import org.oca.javaBasics.scopeOfVar.Layout;

public class Main {
 boolean a;

    public static void main(String[] args){
        Layout q = new Layout();
        Layout.s = 200;
        System.out.println("q.x");
        System.out.println(q.x);
        q.doStuff() ;
        System.out.println("q.x");
        System.out.println(q.x);
    }

}
