class solution {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1,0};
        int target = 4;
        int Start = 0;
        int End = arr.length - 1 ;
        int ans = BinarySearch(arr, target, Start, End);
        System.out.println(ans);
    }

    static int BinarySearch(int[] arr , int target , int Start , int End){
    if (arr.length==1){
        return arr[0];
    }
    while ( Start <= End ){
        int mid = Start + (End - Start)/2;
        
        if(arr[Start]>arr[End]){
            if (arr[mid] > target){
                Start = mid + 1;
            } else if (arr[mid] < target) {
                End = mid - 1;
            }
        }else if (arr[Start]<arr[End]) {
            if (arr[mid] < target){
                Start = mid + 1;
            } else if (arr[mid] > target) {
                End = mid - 1;
            }   
        } else {
            return mid;
        }
    }
    return -1; 
}
}

