// package DSA-using-Java.Arrays.Arrays basics and Operation.Lecture-01;

public class arrays {

    public static void main (String[] args){
        int[] arr = new int[10];//declaration and instantiation  
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;  // basic way 
        arr[5] = 6;
        arr[6] = 7;
        arr[7] = 8;
        arr[8] = 9;
        arr[9] = 10;
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }
    // public static void main (String[] args){
    //     int[] arr = {1,2,3,4,5,6,7,8,9,10};    //declaration and instantiation amd initialization
    //     for (int i = 0; i < arr.length; i++) {
    //         System.out.println(arr[i]);
    //     }
    // }
    // public static void main (String[] args){
    //     int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
    //     for (int i = 0; i < 3; i++) {
    //         for (int j = 0; j < 3; j++) {
    //             System.out.print(arr[i][j] + " ");                
    //         }
    //         System.out.println();
    //     }
    // }
}
