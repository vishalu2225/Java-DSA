import java.util.Arrays;

public class RemoveDuplicateFromSortedArray
{
    public int removeDuplicates(int[] nums)
    {
        int i = 0;
        int j = 1;
        int n = nums.length;

        while(j < n)
        {
            if(nums[i] == nums[j])
            {
                j++;
            }
            else
            {
                i++;
                nums[i] = nums[j];
                j++;
            }
        }

        return i + 1;
    }

    public static void main(String[] args)
    {
        RemoveDuplicateFromSortedArray obj =
                new RemoveDuplicateFromSortedArray();

        int nums[] = {1, 1, 2, 2, 3, 4, 4};

        int k = obj.removeDuplicates(nums);

        System.out.println("Number of unique elements: " + k);

        System.out.print("Array after removing duplicates: ");

        for(int i = 0; i < k; i++)
        {
            System.out.print(nums[i] + " ");
        }
    }
}