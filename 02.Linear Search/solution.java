
import java.awt.datatransfer.FlavorListener;



// public class solution{
    // public static void main(String[] args) {

        // int[] nums = {1,2,3,4,5,6,7,8,9};
        // int target = 56;
        // // // Linear Search
        // int ans = linearSearch(nums, target);
        // System.out.println(ans);
        // // // Search In range
        // int start = 1;
        // int end = 5;
        // System.out.println(SearchInRange(nums, target, start, end));
        // // Max And Min
        // System.out.println(Max(nums));
        
        
    // }
        
    // // // Linear Search
    // static int linearSearch(int[] arr , int target ) {
        
    //     if (arr.length==0){
    //         return -1;
    //     }

    //     for (int index = 0; index < arr.length; index++) {
    //         int element = arr[index];
    //         if (element == target) {
    //             return index;
    //             // // or we can return the element or boolean value
    //         }
    //     }
    //     return -1;
    // }
     
    // // Search in Range 
    // static int SearchInRange(int[] arr , int target , int start , int end ) {
        
    //     if (arr.length==0){
    //         return -1;
    //     }

    //     for (int index = start; index < end; index++) {
    //         int element = arr[index];
    //         if (element == target) {
    //             return index;
    //             // // or we can return the element or boolean value
    //         }
    //     }
    //     return -1; 
    // }

    // // Finding Max and min
    // static int Max(int[] arr){
        // int max_number = arr[0];
        // for (int index = 1; index < arr.length; index++) {
    //         if (max_number <= arr[index]){
    //             max_number = arr[index];
    //         }
    //     }
    //     return max_number;
    // }

    
    // public static void main(String[] args) {
    //     // Define a 2D array of integers
    //     int[][] nums = {
    //         {1, 2, 3, 4},
    //         {5, 6, 7, 8, 9, 20},
    //         {11, 23, 45, 67}
    //     };
        
    //     // Define the target value to search for
    //     int target = 8;
        
    //     // Call the search method and store the result
    //     int[] ans = search2DArr(nums, target);
        
    //     // Print the result as a string
    //     System.out.println(Arrays.toString(ans));
    // }
    // static int[] search2DArr(int[][] arr, int target) {
    //     // Iterate through each row of the 2D array
    //     for (int row = 0; row < arr.length; row++) {
    //         // Iterate through each column of the current row
    //         for (int col = 0; col < arr[row].length; col++) {
    //             // Check if the current element matches the target
    //             if (target == arr[row][col]) {
    //                 // If found, return the current indices
    //                 return new int[]{row, col};
    //             }
    //         }
    //     }
    //     // If target is not found, return {-1, -1}
    //     return new int[]{-1, -1};
    // }


    //    // Given an array nums of integers, return how many of them contain an even number of digits.

        
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

    class Solution {
        public int findNumbers(int[] nums) {
            int count = 0 ;
            for (int num : nums) {
                if (even(num)){
                    count++;
                }
            }
            return count;
        }
        static boolean even(int num){
            int numberofdigit = digits(num);
            if (numberofdigit%2==0){
                return true;
            }
            return false;
        }
        static int digits(int num){
            int count = 0;
            while (num > 0 ){
                count++ ;
                num = num/10;
            }
            return count;
        }
        public static void main(String[] args) {
            int nums = [12,345,2,6,7896];

        }
    }

