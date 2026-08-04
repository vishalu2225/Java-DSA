import java.util.ArrayList;
import java.util.List;

public class ThreeSum
{
    public List<List<Integer>> threeSum(int[] nums)
    {
        List<List<Integer>> output = new ArrayList<>();

        int target = 0;
        int n = nums.length;

        for(int i = 0; i < n - 2; i++)
        {
            for(int j = i + 1; j < n - 1; j++)
            {
                for(int k = j + 1; k < n; k++)
                {
                    if(nums[i] + nums[j] + nums[k] == target)
                    {
                        List<Integer> temp = new ArrayList<>();

                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);

                        output.add(temp);
                    }
                }
            }
        }

        return output;
    }
    //15.class Solution {
    //    public List<List<Integer>> threeSum(int[] nums)
    //    {
    //        Set<List<Integer>> result=new HashSet<>();
    //        int n=nums.length;
    //        int target=0;
    //        for(int i=0;i<n-2;i++){
    //            for(int j=i+1;j<n-1;j++){
    //                for(int k=j+1;k<n;k++){
    //                    if(nums[i]+nums[j]+nums[k]==target){
    //                        List<Integer> temp=new ArrayList<>();
    //                        temp.add(nums[i]);
    //                        temp.add(nums[j]);
    //                        temp.add(nums[k]);
    //                        Collections.sort(temp);
    //
    //                        result.add(temp);
    //
    //
    //                    }
    //                }
    //            }
    //
    //        }
    //        return  new ArrayList<>(result);
    //
    //
    //    }
    //}

    public static void main(String[] args)
    {
        ThreeSum obj = new ThreeSum();

        int nums[] = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> result = obj.threeSum(nums);

        System.out.println(result);
    }
}