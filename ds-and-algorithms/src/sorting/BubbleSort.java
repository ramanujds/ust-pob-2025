package sorting;

public class BubbleSort {

    public static void sort(int []arr){

        int length = arr.length;

        for (int i=0 ; i<length-1; i++){
            for (int j=i+1; j<length; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

    }

    public static void main(String[] args) {

        int []arr = {7,5,2,8,6,3};

        sort(arr);

        for (int i:arr){
            System.out.print(i+"\t");
        }

    }


}
