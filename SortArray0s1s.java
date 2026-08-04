public class SortArray0s1s {

    public int[] sortArray(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = n - 1;

        while (i < j) {
            if (nums[i] == 1 && nums[j] == 0) {
                nums[i] = 0;
                nums[j] = 1;
                i++;
                j--;
            } else if (nums[i] == 0) {
                i++;
            } else if (nums[j] == 1) {
                j--;
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        SortArray0s1s obj = new SortArray0s1s();

        int[] arr = {1, 0, 1, 0, 1, 0};

        arr = obj.sortArray(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}