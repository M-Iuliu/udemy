package org.oca.workingWithDataTypes_2;

public class Test {

        public static void main(String[] args) {
            char c = 'Z';
            long l = 100_00l;
            int i = 9_2;
            float f = 2.02f;
            double d = 10_0.35d;

            System.out.println("c " + c);
            System.out.println("l " + l);
            System.out.println("i " + i);
            System.out.println("f " + f);
            System.out.println("d " + d);

            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();

            l = c + i;
            System.out.println("l " + l);

            f = c * l * i * f;
            System.out.println("f " + f);

            f = l + i + c;
            System.out.println("f "  + f);

            i = (int)d;
            System.out.println("i " + i);

            f = (long)d;
            System.out.println("f " + f);

        }
}
