class solution {
    
    public static void main(String[] args ){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 8;
        int start = 0;
        int end = arr.length - 1;
        int i = BinarySearch(arr, target, start, end);
        System.out.println(i);
        }
    
        static int BinarySearch(int[] arr , int target , int start , int end ) {
    
            while (start <=  end ) {
                int mid = start + (end - start) / 2;
                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            return -1;
        }
    
    // }
    // static int BinarySearch(int[] arr , int target , int Start , int End){
    // if (arr.length==1){
    //     return arr[0];
    // }
    // while ( Start <= End ){
    //     int mid = Start + (End - Start)/2;
        
    //     if(arr[Start]>arr[End]){
    //         if (arr[mid] > target){
    //             Start = mid + 1;
    //         } else if (arr[mid] < target) {
    //             End = mid - 1;
    //         }
    //     }else if (arr[Start]<arr[End]) {
    //         if (arr[mid] < target){
    //             Start = mid + 1;
    //         } else if (arr[mid] > target) {
    //             End = mid - 1;
    //         }   
    //     } else {
    //         return mid;
    //     }
    // }
    // return -1; 
    // }
}

