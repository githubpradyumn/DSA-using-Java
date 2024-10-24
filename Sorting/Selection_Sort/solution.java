import java.util.Arrays;

public class solution {

    public static void main(String[] args) {
        int[] arr = {5,4,3,6,2,1};
        Selection_Sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Selection_Sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - 1 - i;
            int MaxIndex = getMaxIndex(arr, 0, last);
            swap(arr, MaxIndex, last);
        }
    }

    static void swap(int[] arr, int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = arr[first];
    }

    static int getMaxIndex(int[] arr , int start , int end ){
        int max = start ;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]){
                max = i ;
            }
        }
    return max;   
    }
}
