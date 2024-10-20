class solution{
    public static void main(String[] args) {
        int[] nums = {-10,-5,0,5,6,9,12,13,14,15,16,34,46,75,100};
        int target = 0;
        int Start = 0;
        int End = nums.length - 1 ;
        int ans = BinarySearch(nums, target, Start, End);
        System.out.println(ans);
    }

    static int BinarySearch(int[] arr , int target , int Start , int End){
    if (arr.length==1){
        return arr[0];
    }
    while ( Start <= End ){
        int mid = Start + (End - Start)/2;
        if (arr[mid] < target){
            Start = mid + 1;
        } else if (arr[mid] > target) {
            End = mid - 1;
        } else {
            return mid;
        }
    }
    return -1; 
    }
}

