package org.example;

public class Main18_Constructor {
    int modelYear;
    String modelName;
    public Main18_Constructor(int year, String name){
        modelName = name;
        modelYear=year;


    }

    public static void main(String[] args) {
        Main18_Constructor main18_constructor = new Main18_Constructor(2020,"vaxhall");
        System.out.println(main18_constructor.modelName);
        System.out.println(main18_constructor.modelYear);

    }
}
