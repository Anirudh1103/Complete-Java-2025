public class LeetCode1295 {
    public static void main(String[] args) {
        System.out.println(findNumbers(new int[] {12,345,2,6,7896}));
    }
    static int findNumbers(int[] nums)
    {
        int count = 0;
        for(int num : nums)
        {
            if(even(num))
                count++;
        }
        return count;
    }

    private static boolean even(int num) {
        int digitCount = 0;
        while (num > 0)
        {
            num = num / 10;
            digitCount++;
        }
        return digitCount%2 == 0;
    }
}
