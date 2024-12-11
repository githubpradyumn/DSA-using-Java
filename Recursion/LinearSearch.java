public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        int target = 7;
        int ans = search(arr,target,0);
        System.out.println(ans);
    }
    static int search(int[] arr , int target , int index ){
       if (index == arr.length ){
        return -1;
       } 
       if (arr[index] == target){
        return index;
       }
       return search(arr,target,index + 1);
    }
    
}
