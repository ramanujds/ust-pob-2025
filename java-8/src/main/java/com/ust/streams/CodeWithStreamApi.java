package com.ust.streams;

import java.util.ArrayList;
import java.util.List;

public class CodeWithStreamApi {

    public static void main(String[] args) {

        List<Integer> list = List.of(2,5,7,6,4,9);

        var output = list.stream().filter(e -> e%2==0)
                    .map(e -> e*e)
                    .toList();

        System.out.println(output);

    }



}
