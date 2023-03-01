package org.example;

import com.sun.jdi.PathSearchingVirtualMachine;

public class MainD {
    public static void main(String[] args) {
//        learn how to use increment
        int inc =10;
        System.out.println(inc);
        int newInc = inc++;
        System.out.println(inc);
        int anotherInc = inc++;
        System.out.println(inc);

        int dec = 20;
        System.out.println(dec);
        int newDec=dec--;
        System.out.println(dec);
        System.out.println(newDec);

        System.out.println(inc);






    }
}
