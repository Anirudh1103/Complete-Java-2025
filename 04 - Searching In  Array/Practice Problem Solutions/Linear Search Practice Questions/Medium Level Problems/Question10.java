import java.util.Arrays;

public class Question10 {
    // Search and Replace
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3};
        System.out.println("Before Replacement: " + Arrays.toString(arr));
        searchAndReplace(arr, 2, 9);
        System.out.println("After Replacement: " + Arrays.toString(arr));
    }
    static void searchAndReplace(int[] arr, int searchEle, int replaceEle)
    {
        if(arr.length != 0)
            for (int i = 0; i < arr.length; i++)
                if(arr[i] == searchEle)
                    arr[i] = replaceEle;

    }
}
