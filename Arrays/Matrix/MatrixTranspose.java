package Matrix;

import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix dimensions
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Input matrix elements
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Compute transpose
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Print transpose
        System.out.println("Transpose of the matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}


// public class MatrixTranspose {
//     public static void main(String[] args) {
//         int[][] matrix = {
//                 {1, 2, 3},
//                 {4, 5, 6},
//                 {7, 8, 9}
//         };

//         int rows = matrix.length;
//         int cols = matrix[0].length;

//         int[][] transpose = new int[cols][rows];

//         // Transpose the matrix
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 transpose[j][i] = matrix[i][j];
//             }
//         }

//         // Print the transposed matrix
//         for (int i = 0; i < cols; i++) {
//             for (int j = 0; j < rows; j++) {
//                 System.out.print(transpose[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }