package org.example;


public class Main19_Constructor {
    String firstName;
    String middleName;
    String lastName;
    int age;
    public Main19_Constructor(String firstname, String middleName, String lastName, int age){
        this.firstName=firstname;
        this.middleName=middleName;
        this.lastName=lastName;
        this.age=age;
//        what i don't understand is the reason why we repeat the process like
//        typing out the strings in the first place and then
//        doing the same when you are calling the method in your new main method list.


    }

    public static void main(String[] args) {
        Main19_Constructor main18_constructor = new Main19_Constructor("nnenna", "ola", "Abdul", 49);
        System.out.println(main18_constructor.age);
        System.out.println(main18_constructor.lastName);
        System.out.println(main18_constructor.middleName);
        System.out.println(main18_constructor.firstName);


    }}

