package org.oca.javaBasics_1.recap;

public class WaterTank {
    private String brand;
    private boolean empty;

    public static void main(String[] args){
        WaterTank wt = new WaterTank();
        wt.print();
        System.out.println(wt.empty);
        System.out.println(wt.brand);
        for(int i=0; i<10; i++);
        System.out.println(wt.brand);
    }

    public void print(){
        System.out.println(this.empty);
    }
}
