
import java.lang.reflect.Array;

Simple Linear Search Code 
class solution {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,0};
        int target = 7;
        int ans = LinearSearch(nums,target);
        System.out.println(ans);
    }

    static int LinearSearch(int[] arr,int target){
        if (arr.length==0){
            return -1 ;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (target==element){
                return index;
            }
        }
    return -1;
    }

}

// // Search in Range 
// Finding Max and min
// Given an array nums of integers, return how many of them contain an even number of digits.
        
//
    //    // Example 1:
//
    //    // Input: nums = [12,345,2,6,7896]
    //    // Output: 2
    //    // Explanation: 
    //    // 12 contains 2 digits (even number of digits). 
    //    // 345 contains 3 digits (odd number of digits). 
    //    // 2 contains 1 digit (odd number of digits). 
    //    // 6 contains 1 digit (odd number of digits). 
    //    // 7896 contains 4 digits (even number of digits). 
    //    // Therefore only 12 and 7896 contain an even number of digits.
