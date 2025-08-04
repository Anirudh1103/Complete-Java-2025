import java.util.ArrayList;

public class Question9 {
    // Search in Unsorted Array with Duplicates
    public static void main(String[] args) {
        System.out.println(searchInArrayWithDuplicates(new int[] {1, 2, 1, 3}, 1));
        System.out.println(searchInArrayWithDuplicates(new int[] {4, 4, 4}, 4));
        System.out.println(searchInArrayWithDuplicates(new int[] {1, 2, 3}, 5));
    }
    static ArrayList<Integer> searchInArrayWithDuplicates(int[] arr, int target)
    {
        ArrayList<Integer> result = new ArrayList<>();
        if(arr.length != 0)
        {
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == target)
                    result.add(i);
            }
        }
        return result;
    }
}
