package org.example;

public class Main13_Array {
    public static void main(String[] args) {
        String[] languages = {"English", "French", "Spanish", "hausa", "youruba", "Igbo",};
        System.out.println(languages.length);
//        using Try Catch to handle exception and to make your test not stop when you encounter any problems
//        try catch handles exceptions without showing red or stopping your run at that point.
        try {
            System.out.println(languages[7]);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(languages[2]);
        System.out.println(languages[0]);
        System.out.println(languages[5]);
        for (String B : languages) {
            System.out.println(B);
        }
////////////////////////////////////////////////////////////////////////////
//for each example
        int[] myNum = {5, 10, 15, 20, 20, 25};
        System.out.println(myNum.length);
        for (int a : myNum) {
            System.out.println(a);
        }
        System.out.println(7);

    }
}