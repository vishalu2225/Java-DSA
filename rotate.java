public class rotate {

    // Your rotate logic
    public static void rotate(int[][] matrix) {
        // Step 1: Transpose of a matrix
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < n; j++) { // to work with upper triangle
                // swap matrix[i][j], matrix[j][i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse of all rows of matrix
        for (int row = 0; row < m; row++) {
            int startCol = 0;
            int endCol = n - 1;

            while (startCol <= endCol) {
                // swap matrix[row][startCol], matrix[row][endCol]
                int temp = matrix[row][startCol];
                matrix[row][startCol] = matrix[row][endCol];
                matrix[row][endCol] = temp;

                startCol++;
                endCol--;
            }
        }
    }

    // Helper method to print the matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    // Main method to run and test the code
    public static void main(String[] args) {
        // Sample 3x3 Matrix
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        // Call the rotate function
        rotate(matrix);

        System.out.println("\nMatrix After 90 Degree Clockwise Rotation:");
        printMatrix(matrix);
    }
}
