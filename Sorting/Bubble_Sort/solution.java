import java.util.Arrays;
class solution{

    
    public static void main(String[] args) {
        int[] nums = {54,85,65,9,0,7,5,6,14,-85,-7};
        BubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }


    static void BubbleSort (int[] arr ) {
        boolean swapped ;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }    
            if (!swapped) {
                break;   
            }
        }
    }
}