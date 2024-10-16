public class solution {
    public static void main(String[] args) {

        int[] num = {-9,-8,-7,-6,-5,-4,-3,-2,-1,0,1,2,3,4,5,6,7,8,9,10};
        int target = 2 ;
        int start = 0;
        int end = num.length - 1 ; 
        int ans = BinarySearch(num, target, start, end);
        System.out.println(ans);
        
    }

    static int BinarySearch(int[] arr , int target , int start , int end ){


        while (start <= end ){
            int mid = start + (end - start)/2 ;
            
            if (target > arr[mid]) {

                start = mid + 1;

            } else if (target < arr[mid]) {

                end = mid -1;

            } else {
                return mid ;
            }
        }
        return -1;

    }
    
}
