package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExample {

    public static void main(String[] args) {

        // Convert number to words

        // Input a number

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = scanner.nextInt() ;

        Map<Integer, String> nums = new HashMap<>();
        nums.put(1,"One");
        nums.put(4,"Four");
        nums.put(5,"Five");
        nums.put(6,"Six");
        nums.put(7,"Seven");
        nums.put(2,"Two");
        nums.put(3,"Three");
        nums.put(8,"Eight");
        nums.put(9,"Nine");
        nums.put(0,"Zero");

        System.out.println(nums.get(num));


        // kolkata
        // find the occurrences of each char



    }

}
