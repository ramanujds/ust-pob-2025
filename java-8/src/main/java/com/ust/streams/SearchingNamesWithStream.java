package com.ust.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SearchingNamesWithStream {

    public static void main(String[] args) {

        List<String> names = List.of("harsh","karan","gaurav","javed","krish","karan");


        // search names starts with k

        var list = names.stream().filter(s->s.startsWith("k"))
                                .map(s->s.toUpperCase())
                                .distinct()
                                .collect(Collectors.toList());

        System.out.println(list);



    }


}
