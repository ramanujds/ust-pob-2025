package sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

public class QuickSort {

    public static void main(String[] args) {
        int []arr = {2,6,8,3,7,1};

        quicksort(arr,0,arr.length-1);

        for (int e:arr){
            System.out.print(e+"\t");
        }



    }



    public static void quicksort(int[] arr, int start, int end) {

        if (start < end) {
            int q = partition(arr, start, end);
            quicksort(arr, start, q - 1);
            quicksort(arr, q + 1, end);
        }

    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start - 1;
        for (int j = start; j < end - 1; j++) {
            if (arr[j] <= pivot) {
                i++;
                int iTemp = arr[i];
                int jTemp = arr[j];
                arr[i] = jTemp;
                arr[j] = iTemp;
            }
        }
        i++;
        int iTemp = arr[i];
        arr[end] = iTemp;
        arr[i] = pivot;
        return i;
    }

}
