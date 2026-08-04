public class MissingNumber268 {

    public int missingNumber(int[] nums) {

        int xorSum = 0;

        // XOR with all array elements
        for (int num : nums) {
            xorSum = xorSum ^ num;
        }

        // XOR with numbers from 0 to n
        int n = nums.length;
        for (int i = 0; i <= n; i++) {
            xorSum = xorSum ^ i;
        }

        return xorSum;
    }

    public static void main(String[] args) {

        MissingNumber268 obj = new MissingNumber268();

        int[] nums = {3, 0, 1};

        int ans = obj.missingNumber(nums);

        System.out.println("Missing Number = " + ans);
    }
}
