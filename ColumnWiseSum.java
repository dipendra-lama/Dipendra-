import java.util.Scanner;

public class ColumnWiseSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Input the dimensions of the matrix
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        // 2. Input the matrix elements
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // 3. Calculate and print column-wise sum
        System.out.println("\nColumn-wise Sum:");
        for (int j = 0; j < cols; j++) {
            int colSum = 0; // Reset sum to 0 for every new column
            
            for (int i = 0; i < rows; i++) {
                colSum += matrix[i][j]; // Add each element of the current column
            }
            
            System.out.println("Sum of Column " + (j + 1) + " = " + colSum);
        }

        sc.close();
    }
}
