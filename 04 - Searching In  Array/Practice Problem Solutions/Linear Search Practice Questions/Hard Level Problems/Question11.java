import java.util.Arrays;

public class Question11 {
    //   Longest Repeating Number Sequence
    public static void main(String[] args) {
        System.out.println(Arrays.toString(longestRepeatingNumberSequence(new int[] {1, 2, 3})));
    }
    static int[] longestRepeatingNumberSequence(int[] arr)
    {
        int currCount = 1, maxCount = 1, target = arr[0];

        if(arr.length != 0)
            for (int i = 1; i < arr.length; i++) {
                if(arr[i] == arr[i-1])
                    currCount++;
                else
                    currCount = 1;

                if(currCount > maxCount)
                {
                    maxCount = currCount;
                    target = arr[i];
                }
            }
        return new int[] {target, maxCount};
    }
}
