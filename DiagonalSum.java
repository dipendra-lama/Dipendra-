import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the square matrix: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];
        int sum = 0;

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Find diagonal sum
        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];
        }

        System.out.println("Sum of diagonal elements = " + sum);

        sc.close();
    }
}
