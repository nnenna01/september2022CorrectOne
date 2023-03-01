package org.example;

public class Main5_WithParameter {
    public int max(int x, int y) {
        if (x > y)
            return x;
        else return y;
    }


    private int additionMethod(int x, int y) {
        return (x + y);
    }
        public int subtractionMethod(int x, int y) {
            return (x - y);
        }
            private int multiplicationMethod(int x, int y) {
                return (x * y);
    }

    //for here we need to get an instance of the class max. an object is an instance of a class
    public static void main(String[] args) {
        Main5_WithParameter main5_withParameter = new Main5_WithParameter();

        System.out.println(main5_withParameter.max(100, 500));
        System.out.println(main5_withParameter.additionMethod(10, 20));
        System.out.println(main5_withParameter.multiplicationMethod(17, 60 ));
        System.out.println(main5_withParameter.subtractionMethod(500,150));
        System.out.println(main5_withParameter.additionMethod(67,56));
        System.out.println(main5_withParameter.max(1000, 873));

    }
}
