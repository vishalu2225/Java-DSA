import java.util.ArrayList;
import java.util.List;

public class SumOfEachColumnIn2D { // Fixed: Changed double braces {{ to single {
    public List<Integer> colSums(int[][] matrix){
        List<Integer> result = new ArrayList<>();

        // Edge case handling: check if the input array is empty or null
        if (matrix == null || matrix.length == 0) {
            return result;
        }

        int m = matrix.length;          // number of rows
        int n = matrix[0].length;       // Fixed: Changed matrix.length to matrix[0].length for correct column count

        // Traversal
        for(int col = 0; col < n; col++){
            int sum = 0;
            for(int row = 0; row < m; row++){
                int value = matrix[row][col];
                sum = sum + value;
            }
            // jaise hi mai ek column me entire traversal karke
            // sum nikal chuka honga, tab main uss sum ko result me store kardunga
            result.add(sum);
        }

        return result;
    }

    // Main function to test the code
    public static void main(String[] args) {
        // Fixed: Changed 'SumOfEachRowIn2D' to match current class name 'SumOfEachColumnIn2D'
        SumOfEachColumnIn2D solution = new SumOfEachColumnIn2D();

        // Sample 2D Array (3 rows and 3 columns)
        int[][] sampleMatrix = {
                {1, 2, 3},  // Col 0: 1+4+7 = 12
                {4, 5, 6},  // Col 1: 2+5+8 = 15
                {7, 8, 9}   // Col 2: 3+6+9 = 18
        };

        // Fixed: Changed solution.rowSums to solution.colSums
        List<Integer> output = solution.colSums(sampleMatrix);

        // Printing the output
        System.out.println("Input Matrix:");
        for (int i = 0; i < sampleMatrix.length; i++) {
            for (int j = 0; j < sampleMatrix[i].length; j++) {
                System.out.print(sampleMatrix[i][j] + " ");
            }
            System.out.println();
        }

        // Fixed: Changed text from "row" to "column"
        System.out.println("\nSum of each column: " + output);
    }
}
