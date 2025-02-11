import java.util.Scanner;

// Define the Matrix interface
interface Matrix {
    void diagonalsMinMax(int[][] matrix);
}

// Main class implementing the Matrix interface
public class q2 implements Matrix {
    
    // Implementation of diagonalsMinMax method
    public void diagonalsMinMax(int[][] matrix) {
        int n = matrix.length;

        // Initialize variables for main diagonal
        int minMainDiagonal = Integer.MAX_VALUE;
        int maxMainDiagonal = Integer.MIN_VALUE;

        // Initialize variables for secondary diagonal
        int minSecondaryDiagonal = Integer.MAX_VALUE;
        int maxSecondaryDiagonal = Integer.MIN_VALUE;

        // Iterate through the matrix
        for (int i = 0; i < n; i++) {
            // Main diagonal element
            int mainDiagonalElement = matrix[i][i];
            minMainDiagonal = Math.min(minMainDiagonal, mainDiagonalElement);
            maxMainDiagonal = Math.max(maxMainDiagonal, mainDiagonalElement);

            // Secondary diagonal element
            int secondaryDiagonalElement = matrix[i][n - 1 - i];
            minSecondaryDiagonal = Math.min(minSecondaryDiagonal, secondaryDiagonalElement);
            maxSecondaryDiagonal = Math.max(maxSecondaryDiagonal, secondaryDiagonalElement);
        }

        // Print the results
        System.out.println("Smallest Element - 1: " + minMainDiagonal);
        System.out.println("Greatest Element - 1: " + maxMainDiagonal);
        System.out.println("Smallest Element - 2: " + minSecondaryDiagonal);
        System.out.println("Greatest Element - 2: " + maxSecondaryDiagonal);
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the matrix
        int n = scanner.nextInt();

        // Create the matrix
        int[][] matrix = new int[n][n];

        // Read the matrix elements
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Create an instance of Main and call diagonalsMinMax
        q2 main = new q2();
        main.diagonalsMinMax(matrix);
    }
}
