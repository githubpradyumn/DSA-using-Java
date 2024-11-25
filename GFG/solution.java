public class solution {
    // Print numbers from 1 to n without the help of loops.
//    You only need to complete the function printNos() that takes n as a parameter and prints the number from 1 to n recursively.
//
//            Note: Don't print any newline, it will be added by the driver code.
//
//    Examples:
//
//    Input: n = 10
//    Output: 1 2 3 4 5 6 7 8 9 10
//    Input: n = 5
//    Output: 1 2 3 4 5
//    Input: n = 1
//    Output: 1
//    public static void main(String[] args){
//        print(1,1);
//    }


// User function Template for Java

//    class Solution {
//
//        public void printNos(int n) {
//            // Your code here
//
//            if(n == 0)
//                return;
//
//
//            printNos(n-1);
//            System.out.print(n + " ");
//
//
//        }
//    }


//    Question Given an array, arr[] sorted in ascending order and an integer k.
//             Return true if k is present in the array, otherwise, false.
//
//    Examples:
//
//    Input: arr[] = [1, 2, 3, 4, 6], k = 6
//    Output: true
//    Exlpanation: Since, 6 is present in the array at index 4 (0-based indexing), output is true.
//    Input: arr[] = [1, 2, 4, 5, 6], k = 3
//    Output: false
//    Exlpanation: Since, 3 is not present in the array, output is false.
//    Input: arr[] = [2, 3, 5, 6], k = 1
//    Output: false
//    Constraints:
//            1 <= arr.size() <= 106
//            1 <= k <= 106
//            1 <= arr[i] <= 106
//    Answer
//        public static void main(String[] args){
//            int[] nums = { 2, 4, 6};
//            int target = 1;
//            boolean ans = search(nums , target);
//            System.out.println(ans);
//        }
//        static boolean search(int[] nums, int target) {
//            // Start is the index 0 and end is the last index of the array
//            int start = 0;
//            int end = nums.length - 1;
//            while (start <= end) {
//                // as middle value changes we place it inside the loop
//                int mid =  start + (end-start)/2;
//                if(nums[mid]==target){
//                    return true;
//                } else if(target<nums[mid]) {
//                    end = mid -1;
//                } else {
//                    start = mid+1;
//                }
//            }
//            return false;
//        }
//
}
