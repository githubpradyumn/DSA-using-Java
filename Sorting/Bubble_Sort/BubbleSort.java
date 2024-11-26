import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {3,1,5,4,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void sort(int[] arr){
        boolean swapped;
//        i is for the outer loop
//        run for the n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
//            j is for the inner loop
//            max item will come at the last respective index
            for (int j = 1; j < arr.length-i; j++) {
//                now compare and swap the values 
                if (arr[j]<arr[j-1]){
            //    swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }