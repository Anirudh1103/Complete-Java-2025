import java.util.Arrays;

public class LeetCode1 {
    //  1. Two Sum
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[] {2,7,11,15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[] {3,2,4}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[] {3,3}, 6)));
    }

    static int[] twoSum(int[] nums, int target)
    {
        int index1 = -1, index2 = -1;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target)
                {
                    index1 = i;
                    index2 = j;
                }
            }
        }
        return new int[] {index1, index2};
    }
}
