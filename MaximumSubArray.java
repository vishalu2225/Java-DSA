public class MaximumSubArray
{

    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            // step1: create sum
            sum = sum + nums[i];

            // step2: update max
            maxi = Math.max(maxi, sum);

            // step3: sum check for -VE value
            if (sum < 0) {
                sum = 0;
            }
        }

        return maxi;
    }

    public static void main(String[] args) {

        MaximumSubArray obj = new MaximumSubArray();

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int result = obj.maxSubArray(nums);

        System.out.println("Maximum Subarray Sum: " + result);
    }
}
