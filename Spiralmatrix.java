import java.util.ArrayList;
import java.util.List;

public class Spiralmatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        // Base case: check if matrix is empty
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) { // FIXED: matrix[0].length
            return result;
        }

        int m = matrix.length;     // Number of rows
        int n = matrix[0].length;  // Number of columns // FIXED: matrix[0].length

        int startingRow = 0;
        int endingRow = m - 1;
        int startingCol = 0;
        int endingCol = n - 1;

        while (startingRow <= endingRow && startingCol <= endingCol) {

            // 1. Row wise: Left to Right
            for (int col = startingCol; col <= endingCol; col++) {
                result.add(matrix[startingRow][col]);
            }
            startingRow++;

            // 2. Column wise: Top to Bottom
            for (int row = startingRow; row <= endingRow; row++) {
                result.add(matrix[row][endingCol]);
            }
            endingCol--;

            // 3. Row wise: Right to Left
            if (startingRow <= endingRow) {
                for (int col = endingCol; col >= startingCol; col--) {
                    result.add(matrix[endingRow][col]);
                }
                endingRow--;
            }

            // 4. Column wise: Bottom to Top
            if (startingCol <= endingCol) {
                for (int row = endingRow; row >= startingRow; row--) {
                    result.add(matrix[row][startingCol]);
                }
                startingCol++;
            }
        }

        return result;
    }

    // Main function to test the solution
    public static void main(String[] args) {
        // FIXED: Instantiating the correct class name "Spiralmatriximport"
        Spiralmatrix solution = new Spiralmatrix();

        // Sample 3x4 matrix
        int[][] matrix = {
                {1,  2,  3,  4},
                {5,  6,  7,  8},
                {9, 10, 11, 12}
        };

        System.out.println("Original Matrix:");
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }

        List<Integer> output = solution.spiralOrder(matrix);

        System.out.println("\nSpiral Order Output:");
        System.out.println(output);
    }
}
