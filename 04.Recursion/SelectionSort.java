import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {3,1,5,4,2};
        sort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr,int n){
        if(n==1){
            return;
        }
        int getmax = Max(arr,0, n - 1);
        swap(arr, getmax, n - 1);
        sort(arr,n-1);

    }

    static int Max(int[] arr, int start , int last ){
        int max = start;
        for (int i = start; i <= last; i++) {
            if ( arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
