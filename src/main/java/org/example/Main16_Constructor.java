package org.example;

public class Main16_Constructor {
    int x;

    public Main16_Constructor(int y) {
        x = y;
    }

    public static void main(String[] args) {
        Main16_Constructor myObj = new Main16_Constructor(120);
        System.out.println(myObj.x);
    }
//    here the onbject is the object of the class you want to create. It can be named any thng
//    as long as you remember to call it whenever you want to call the main class.
}

