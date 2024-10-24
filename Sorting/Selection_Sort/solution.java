// 

    // public static void main(String[] args) {
    //     int[] arr = {6,5,2,8,9,4};
    //     Selection_Sort(arr);
    //     System.out.println(Arrays.toString(arr));
    // }

    // static void Selection_Sort(int[] arr){
    //     for (int i = 0; i < arr.length; i++) {
    //         int last = arr.length - 1 - i;
    //         int MaxIndex = getMaxIndex(arr, 0, last);
    //         swap(arr, MaxIndex, last);
    //     }
    // }

    // static void swap(int[] arr, int first , int second){
    //     int temp = arr[first];
    //     arr[first] = arr[second];
    //     arr[second] = temp;
    // }

    // static int getMaxIndex(int[] arr , int start , int end ){
    //     int max = start;
    //     for (int i = start; i <= end; i++) {
    //         if (arr[max] < arr[i]){
    //             max = i ;
    //         }
    //     }
    // return max;   
    // }
// }


class solution{
    public static void main(String[] args ){
       int[] arr = {0,1,3,5,7,9,11,13,23,34,45,56,67,99};
       int target = 4;
       int start = 0;
       int end = arr.length - 1;
       System.out.println(binarysearch(arr, target, start, end));
    }

    static int binarysearch(int[] arr , int target , int start , int end){
        
        
        while (start<=end){
            int mid = start + (end - start)/2;
            
            if (arr[mid]>target){
                end = mid - 1; 
            } else if (arr[mid]<target){
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
        
    }
}