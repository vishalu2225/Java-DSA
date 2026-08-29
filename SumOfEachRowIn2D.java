import java.util.ArrayList;
import java.util.List;

public class SumOfEachRowIn2D {
    public List<Integer> rowSums(int[][] arr){
        List<Integer> result = new ArrayList<>();

        // Edge case handling
        if (arr == null || arr.length == 0) {
            return result;
        }

        int m = arr.length;       // number of rows
        int n = arr[0].length;    // number of columns

        // Traversal
        for(int row = 0; row < m; row++){
            int sum = 0;
            for(int col = 0; col < n; col++){
                int value = arr[row][col];
                sum = sum + value;
            }
            result.add(sum);
        }
        return result;
    }

    // Main function to test the code
    public static void main(String[] args) {
        // Creating an instance of the class
        SumOfEachRowIn2D solution = new SumOfEachRowIn2D();

        // Sample 2D Array (3 rows and 3 columns)
        int[][] sampleMatrix = {
                {1, 2, 3},  // Row 0 sum: 1 + 2 + 3 = 6
                {4, 5, 6},  // Row 1 sum: 4 + 5 + 6 = 15
                {7, 8, 9}   // Row 2 sum: 7 + 8 + 9 = 24
        };

        // Calling the function
        List<Integer> output = solution.rowSums(sampleMatrix);

        // Printing the output
        System.out.println("Input Matrix:");
        for (int i = 0; i < sampleMatrix.length; i++) {
            for (int j = 0; j < sampleMatrix[i].length; j++) {
                System.out.print(sampleMatrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nSum of each row: " + output);
    }
}
