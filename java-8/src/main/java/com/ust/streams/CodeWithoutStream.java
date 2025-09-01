package com.ust.streams;

import java.util.ArrayList;
import java.util.List;

public class CodeWithoutStream {

    public static void main(String[] args) {

        List<Integer> list = List.of(2,5,7,6,4,9);

        var evens = getEvens(list);

        var squares = getSquares(evens);

        printList(squares);



    }


    static List<Integer> getEvens(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for (int num : list) {
            if (num % 2 == 0) {
                result.add(num);
            }
        }
        return result;
    }

    static List<Integer> getSquares(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for (int num : list) {
            result.add(num * num);
        }
        return result;
    }

    static void printList(List<Integer> list) {
        for (int num : list) {
            System.out.println(num);
        }
    }

}
