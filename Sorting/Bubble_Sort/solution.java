import java.util.Arrays;
class solution{

    
    public class Solution {
        public static void bubbleSort(int[] array) {
            int n = array.length;
            for (int i = 0; i < n - 1; i++) {           // Outer loop
                for (int j = 0; j < n - i - 1; j++) {   // Inner loop up to n - i - 1
                    if (array[j] > array[j + 1]) {
                        // Swap array[j] and array[j + 1]
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }
    
        public static void main(String[] args) {
            int[] array = {64, 34, 25, 12, 22, 11, 90};
            bubbleSort(array);
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }
    