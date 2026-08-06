
import java.util.ArrayList;
import java.util.*;

public class MissingElementFromAnArrayWithDuplicates {

    public List<Integer> findDisapperedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();

        // marking
        for (int index = 0; index < n; index++) {
            int value = Math.abs(nums[index]);

            // ideal index
            int position = value - 1;

            // mark kardo ye position
            if (nums[position] > 0) {
                nums[position] = -nums[position];
            }
        }

        // travel array and whenever you encounter a +ve value,
        // add the number
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                int valueAtThisIndex = i + 1;
                ans.add(valueAtThisIndex);
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        MissingElementFromAnArrayWithDuplicates obj =
                new MissingElementFromAnArrayWithDuplicates();

        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        List<Integer> result = obj.findDisapperedNumbers(nums);

        System.out.println("Missing numbers: " + result);
    }
}
