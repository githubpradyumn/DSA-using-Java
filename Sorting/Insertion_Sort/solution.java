// package DSA-using-Java.Sorting.Insertion_Sort;
import java.util.Arrays;
public class solution {
    public static void main(String[] args) {
        int[] arr = {3,6,8,2,9,1,5};
        Insertion_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    static void Insertion_sort(int[] arr){
        for (int idx = 0; idx < arr.length-1; idx++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                } else {
                    break;
                }
            }  
        }
    }
    static void swap(int[] arr, int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
