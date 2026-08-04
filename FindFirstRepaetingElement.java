import java.util.HashMap;

public class FindFirstRepaetingElement
{
    public int findFirstRepeatingElement(int[] nums)
    {
        HashMap<Integer, Integer> freq = new HashMap<>();

        // Store frequency
        for(int num : nums)
        {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Find first repeating element
        for(int i : nums)
        {
            if(freq.get(i) > 1)
            {
                return i;
            }
        }

        // If no repeating element
        return -1;
    }

    public static void main(String[] args)
    {
        FindFirstRepaetingElement obj =
                new FindFirstRepaetingElement();

        int nums[] = {10, 5, 3, 4, 3, 5, 6};

        int result = obj.findFirstRepeatingElement(nums);

        System.out.println("First repeating element: " + result);
    }
}