package com.ust;

interface Showable {
    void show();
}

interface Printable{
    void print(String str);
}

interface Calculator{
    int calculate(int a, int b);
}

class CalculatorImpl implements Calculator{

    public int calculate(int a, int b) {
        return a+b;
    }
}

public class Java8Example {

    public static void main(String[] args) {
//        Showable showable = () -> System.out.println("Hello");
//        showable.show();

        Printable printable = str -> System.out.println("Hello "+str);

        printable.print("Harsh");

        Calculator calcAdd = (a,b) -> a+b;

        Calculator calcMax = (a,b) -> a>b?a:b;

        int sum = calcAdd.calculate(10,20);

        System.out.println("Sum = "+sum);

        int max = calcMax.calculate(10,20);
        System.out.println("Max = "+max);


    }

}
