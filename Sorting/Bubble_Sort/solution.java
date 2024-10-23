import java.util.Arrays;
class solution{
    public static void main(String[] args) {
        int[] nums = {54,85,65,9,7,5,6,14,-85,-7,0};
        BubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    // static int BubbleSort (int[] arr ) {
    //     boolean swapped ;
    //     for (int i = 0; i < arr.length; i++) {
    //         swapped = false;
    //         for (int j = 1; j < arr.length - 1; j++) {
    //             if (arr[j] < arr[j-1]){
    //                 int temp = arr[j];
    //                 arr[j] = arr[j-1];
    //                 arr[j-1] = arr[j];
    //                 swapped = true;
    //             }
    //         }    
    //     }
    //     // if (!swapped) {
    //         // break;   
    //     // }
    //     return -1;
    // }

}