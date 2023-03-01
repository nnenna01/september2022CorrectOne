package org.example;

public class Main8_NestedIf {
    public String DisplayDayofTheWeek(int x) {
        if (x == 1) {
            return ("Sunday");
        } else if (x == 2) {
            return ("Monday");
        } else if (x == 3) {
            return ("Tuesday");
        } else if (x == 4) {
            return ("Wednesday");
        } else if (x == 5) {
            return ("Thursday");
        } else if (x == 6) {
            return ("Friday");
        } else if (x == 7) {
            return ("Saturday");

        } else

            return ("please enter value between 1 and 7 only");

    }

    public static void main(String[] args) {
        Main8_NestedIf main8_nestedIf = new Main8_NestedIf();
        System.out.println(main8_nestedIf.DisplayDayofTheWeek(3));
        System.out.println(main8_nestedIf.DisplayDayofTheWeek(6));
        System.out.println(main8_nestedIf.DisplayDayofTheWeek(7));
        System.out.println(main8_nestedIf.DisplayDayofTheWeek(8));
        System.out.println(main8_nestedIf.DisplayDayofTheWeek(5));
        System.out.println(main8_nestedIf.DisplayDayofTheWeek(1));
        System.out.println(main8_nestedIf.DisplayDayofTheWeek(4));
    }

}

