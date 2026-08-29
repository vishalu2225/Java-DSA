class Solution {
    public int[][] transpose(int[][] matrix) {
        if(matrix == null || matrix.length == 0){
            return new int[0][0];
        }
        // for original array
        int totalRows = matrix.length;
        int totalCols = matrix[0].length;

        // for new array
        int NewtotalRows = totalCols;
        int NewtotalCols = totalRows;
        int ans[][] = new int[NewtotalRows][NewtotalCols];

        // actual logic
        for(int i = 0; i < totalRows; i++) {
            for(int j = 0; j < totalCols; j++) {
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }

    // Main function to test your transpose logic
    public static void main(String[] args) {
        Solution solver = new Solution();

        // Testing with a rectangular matrix (2 rows, 3 columns)
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        int[][] transposedMatrix = solver.transpose(matrix);

        System.out.println("\nTransposed Matrix (3 rows, 2 columns):");
        printMatrix(transposedMatrix);
    }

    // Helper method to print the matrix
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
