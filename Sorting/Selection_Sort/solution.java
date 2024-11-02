import java.util.Arrays;

class solution {
    
    public static void main(String[] args) {
        int[] arr = {6,5,2,8,9,4};
        int ans = Selection_Sort(arr);
        // System.out.println(Selection_Sort(arr));
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
        arr[second] = temp;
    }
    
    static int getMaxIndex(int[] arr , int start , int end ){
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]){
                max = i ;
            }
        }
    return max;   
    }
    }

