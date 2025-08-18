package arraysexample;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayExample {

    public static void main(String[] args) {

        int []arr = new int[]{10,15,30,25,18, 7, 9};

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && secondSmallest != smallest) {
                secondSmallest = arr[i];
            }

        }



    }

}
