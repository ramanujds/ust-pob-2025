package searching;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {2, 7, 8, 9, 15, 27, 34, 55, 61, 92};
        int item = 25;
        int index = binarySearch(arr, item);
        if (index != -1) System.out.println("Item found at index : " + index);
        else System.out.println("Item not found");
    }


    public static int binarySearch(int[] arr, int item) {
        int p = 0;
        int r = arr.length - 1;
        int q;
        while (p <= r) {
            q = (p + r) / 2;
            if (arr[q] == item) {
                return q;
            } else if (arr[q] > item) {
                r = q - 1;
            } else {
                p = q + 1;
            }
        }

        return -1;
    }

}
