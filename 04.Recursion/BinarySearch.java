public class BinarySearch {
    public static void main (String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,11,12,13};
        int target = 9;
        int start = 0;
        int end =  arr.length - 1;
        System.out.println(binarysearch(arr,target,start, end ));

    }
    static int binarysearch(int[] arr , int target , int start , int end){
        if (start > end){
            return -1;
        }
        int m = start + (end-start)/2;
        if (arr[m] == target) {
            return m;
        }
        if (target < arr[m]){
            return binarysearch(arr , target , start , m - 1);
        }
        return binarysearch(arr ,target , m + 1 , end ) ;
    }
}
