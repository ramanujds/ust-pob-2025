package revision;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UniqueElements {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 2, 4, 5, 1, 6, 3);

//        Set<Integer> unique = numbers.stream().collect(Collectors.toSet());
//
//        System.out.println(numbers);
//        System.out.println(unique);

        Map<Integer, Long> counting = numbers.stream()
                                    .collect(Collectors.groupingBy( i -> i , Collectors.counting()));

        System.out.println(counting);

    }

}
