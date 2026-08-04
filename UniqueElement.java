public class UniqueElement {

    public int findUniqueElement(int[] nums) {
        int xorSum = 0;

        for (int n : nums) {
            xorSum = xorSum ^ n;
        }

        return xorSum;
    }

    public static void main(String[] args) {

        UniqueElement obj = new UniqueElement();

        int[] nums = {2, 3, 5, 4, 5, 3, 4};

        int unique = obj.findUniqueElement(nums);

        System.out.println("Unique Element = " + unique);
    }
}