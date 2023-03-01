package org.example;


import org.junit.jupiter.api.Test;

public class MainBB_UsingTestTag {
//    public static void main(String[] args) {
//        logical operator && (logical And)
    @Test
    public  void runTest(){
//

        int A= 20;
        System.out.println(A<30 && A< 40);
        System.out.println(A>10 && A>20);
//LOGICAL OR
        int B = 5;
        System.out.println(B >5 || B>4);

//        LOGICAL NOT!

        int C = 20;
        System.out.println(!(C<21 && C<28));

}
    }