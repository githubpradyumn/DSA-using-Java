// package DSA-using-Java.Arrays.Arrays basics and Operation.Lecture-01;

public class Multiplication_of_2D_array {
    public static void main(String[] args) {
        // creating two 3x3 matrices for multiplication
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] b = {{9,7,8},{6,5,4},{3,2,1}};
        
        // creating another matrix of order3 to store the multoplication of a*b
        int[][] c = new int[3][3];
        
        // creating loops 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j]=0;
                for (int k = 0; k < 3; k++) {
                    c[i][j]+=a[i][k]*b[k][j];
                }
                System.out.print(c[i][j] + " ");
            }            
            System.out.println();
        }
    }   
}
