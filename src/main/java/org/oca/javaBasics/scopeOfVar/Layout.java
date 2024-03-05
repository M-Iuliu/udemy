package org.oca.javaBasics.scopeOfVar;


public class Layout {
public enum Days { a, b, c, d};

    public static int s =343;
    public int x;
    {x = 7; int x2 = 5;}
    public Layout(){x += 8; int x3 = 6;}

    public void doStuff(){
        for (Days d : Days.values());
        Days[] d2 = Days.values();
        System.out.println(d2[2]);

        int y = 0;
        for( int z =0; z < 4; z++ ) {
            y = z + x;
        }
//      System.out.println("q.y");
//      System.out.println(y);
    }

    public static void main( String[] args ){
        Layout q = new Layout();
        Layout.s = 200;
//        System.out.println("q.x");
//        System.out.println(q.x);
        q.doStuff() ;
//        System.out.println("q.x");
//        System.out.println(q.x);

    }
}
