package com.ust;

import java.util.Scanner;

class PerformOperation {
    String perform(int input, Operation op){
        return op.apply(input);
    }
}

interface Operation{
    String apply(int input);
}

public class LambdaExpressionDemo{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input option and input: ");
        int option= scanner.nextInt();
        int input=scanner.nextInt();
        PerformOperation performOperation = new PerformOperation();
        String output ="";
        if(option==1){
            output = performOperation.perform(input, inp -> inp%2 ==0 ? "Even" : "Odd");
        }
        else if(option == 2){
            output = performOperation.perform(input, inp -> {
                for (int i = 2; i < inp / 2; i++) {
                    if (inp % i == 0) {
                        return "Not Prime";
                    }
                }
                return "Prime";
            });
        }

        System.out.println(output);


    }

}