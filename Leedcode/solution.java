public class solution {
    // public static void  main (String[] args ){
        //    int[] nums = {5,7,7,8,8,10};
        //    int target = 8;
        //    int solution = searchRange(nums,target);
        //    System.out.println(solution);
        //    }
        //
        //    static int searchRange(int[] nums, int target) {
        //        int start = 0;
        //        int end = nums.length -1;
        //        while (start <=  end ) {
        //            int mid = start + (end - start) / 2;
        //            if (nums[mid] == target) {
        //                System.out.println("[" + mid + "," + (mid + 1) + "]");
        //            } else if (nums[mid] > target) {
        //                end = mid - 1;
        //            } else {
        //                start = mid + 1;
        //            }
        //        }
        //        return -1;
        //    }
        
        //  Question01  Given an array of integers nums which is sorted in ascending order, and an integer target,
        //  write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
        //
        //    You must write an algorithm with O(log n) runtime complexity.
        //
        //
        //
        //    Example 1:
        //
        //    Input: nums = [-1,0,3,5,9,12], target = 9
        //    Output: 4
        //    Explanation: 9 exists in nums and its index is 4
        //    Example 2:
        //
        //    Input: nums = [-1,0,3,5,9,12], target = 2
        //    Output: -1
        //    Explanation: 2 does not exist in nums so return -1
        //
        //
        //    Constraints:
        //
        //            1 <= nums.length <= 104
        //            -104 < nums[i], target < 104
        //    All the integers in nums are unique.
        //    nums is sorted in ascending order.
        //
            //Without using recursion
            //public int search(int[] nums, int target) {
            //    // Start is the index 0 and end is the last index of the array
            //    int start = 0;
            //    int end = nums.length - 1;
            //    while (start <= end) {
            //        // as middle value changes we place it inside the loop
            //        int mid =  start + (end-start)/2;
            //        if(nums[mid]==target){
            //            return mid;
            //        } else if(target<nums[mid]) {
            //            end = mid -1;
            //        } else {
            //            start = mid+1;
            //        }
            //    }
            //    return -1;
            //}
        //    with using recursion
        //    public static void main(String[] args){
        //        int[] nums = {5};
        //        int target = 5;
        //        int s = 0;
        //        int e = nums.length - 1;
        //        int ans = search(nums,target,s,e);
        //        System.out.println(ans);
        //    }
        //    static int search(int[] nums, int target , int s,int e) {
        //        int m = s + (e - s) / 2;
        //        if (s > e) {
        //            return -1;
        //        }
        //        if (nums[m] == target) {
        //            return m;
        //        }
        //        if (target < nums[m]) {
        //            return search(nums, target, s, m - 1);
        //        }
        //        return search(nums, target, m + 1, e);
        //    }
}
