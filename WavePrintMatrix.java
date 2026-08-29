import java.util.ArrayList;
import java.util.List;

public class WavePrintMatrix {
    public List<Integer> wavePrintMatrix(int[][] matrix, int m, int n) { // Fixed: Added missing opening brace '{'
        List<Integer> result = new ArrayList<>();

        // Edge case handling: check if the input array is empty or null
        if (matrix == null || m == 0 || n == 0) {
            return result;
        }

        // lets move column wise
        for (int col = 0; col < n; col++) {
            // for ek column index check karo even or odd
            if ((col & 1) == 1) {
                // odd -> bottom to top
                for (int row = m - 1; row >= 0; row--) {
                    result.add(matrix[row][col]);
                }
            } else {
                // even -> top to bottom
                for (int row = 0; row < m; row++) { // Fixed: Changed 'row < n' to 'row < m' because row limit is 'm'
                    result.add(matrix[row][col]);
                }
            }
        }
        return result; // Fixed: Added missing semicolon ';'
    } // Fixed: Added missing closing brace for the method

    // Main function to test the code
    public static void main(String[] args) {
        WavePrintMatrix solution = new WavePrintMatrix();

        // Sample 3x4 Matrix (Rectangular matrix to prove it works perfectly)
        int[][] sampleMatrix = {
                {1,  2,  3,  4},
                {5,  6,  7,  8},
                {9, 10, 11, 12}
        };

        int rows = sampleMatrix.length;    // 3
        int cols = sampleMatrix[0].length; // 4

        List<Integer> output = solution.wavePrintMatrix(sampleMatrix, rows, cols);

        System.out.println("Wave Print Output: " + output);
    }
}
