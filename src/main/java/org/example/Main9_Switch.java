package org.example;

public class Main9_Switch {
    public static void main(String[] args) {
        int dayOfTheWeek = 6;
        switch (dayOfTheWeek){
            case 1:
            System.out.println("Sunday");
            break;
            case 2:

            System.out.println("Monday");
            break;

            case 3:
                System.out.println("Tuesday");
                break;

            case 4:
            System.out.println("Wednesday");
            break;

            case 5:
            System.out.println("Thursday");
            break;

            case 6:
            System.out.println("Friday");
            break;

            case 7:
            System.out.println("Saturday");
            break;



          default:
              System.out.println("please enter a valid week number between 1 and 7");
//sWITCH USES DEFAULT AS TO ELSE. IT ALSO USES CASES AND BREAK. SO CASE 1,2,ETC AND BREAK AS EXIT.

}}}



