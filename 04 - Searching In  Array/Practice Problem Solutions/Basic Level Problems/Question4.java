import java.util.Arrays;

public class Question4 {
    //Find First and Last Occurrence
    public static void main(String[] args) {
        System.out.println(Arrays.toString(firstAndLastOccurrence(new int[] {1, 2, 2, 3, 2}, 2)));
        System.out.println(Arrays.toString(firstAndLastOccurrence(new int[] {5,6,7}, 7)));
        System.out.println(Arrays.toString(firstAndLastOccurrence(new int[] {1, 2, 3}, 4)));
    }
    static int[] firstAndLastOccurrence(int[] arr, int key)
    {
        int first = -1, last = -1;
        if(arr.length != 0)
            for (int i = 0; i < arr.length; i++)
                if(arr[i] == key)
                {
                    if(first == -1)
                    {
                        first = i;
                        last = i;
                    }
                    last = i;
                }
        return new int[] {first, last};
    }
}
