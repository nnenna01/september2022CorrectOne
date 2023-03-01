package org.example;

public class Main4_Logical {
//     learning the Logical operators
    public static void main(String[] args) {

        int A = 5;
        int B = 10;
        int C = 5;
        int D = 7;
        int E = 9;
        int F = 17;
        int G = A + B;
        int H = B - A;
        int I = A * B;
        int J = B / A;
        int K = B % D;
        int L = F % E;
        int M = B + E;
        int N = F % C;
        int O= A%B;

//       I have noticed that i struggle to put a logical operators with the integers
//        for instance if want to say int A ==C . why can i not add it here? Why is it
//        not letting in the logical operator

        System.out.println("Addition " + G);
        System.out.println("this is minus " + H);
        System.out.println("Multiply " + I);
        System.out.println("Division" + " " + J);
        System.out.println("Modulos "+ K);
        System.out.println("Modulo " + L);
        System.out.println("Show Addition " + M);
        System.out.println(N);
        System.out.println(O);
        System.out.println(A==C);
        System.out.println(F>E);
        System.out.println(D<C);
        System.out.println(F>B);
        System.out.println(A!=C);
        System.out.println(C==D);
    }
}

