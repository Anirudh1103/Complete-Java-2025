import java.util.Arrays;

public class Question7 {
    // Search for  multiple elements
    public static void main(String[] args) {
        //int[] arr = {1, 3, 5}, queries = {3, 4};
        //int[] arr = {7,8}, queries = {7,8,9};
        int[] arr = {}, queries = {1};
        System.out.println(Arrays.toString(searchMultipleElements(arr, queries)));
    }

    static String[] searchMultipleElements(int[] arr, int[] queries) {
        String[] result = new String[queries.length];
        Arrays.fill(result, "Not Found");
        int k = 0; //Iteration for result[]
        if (arr.length != 0)
            for (int i : queries)
                for (int j : arr) {
                    if (i == j) {
                        result[k++] = "Found";
                        break;
                    }
                }
        return result;
    }
}
