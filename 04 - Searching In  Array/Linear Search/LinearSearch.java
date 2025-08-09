import java.util.logging.Logger;

public class LinearSearch {
    public static void main(String[] args) {
        System.out.println(linearSearch(new int[] {18,19,21,25,16,32}, 16));
    }
    /*
    Description:
        This method performs a linear search to find the index of a target element in an integer array.
        It checks each element one by one from left to right.

    Params:
        int[] arr - The array in which to search
        int key   - The element to search for

    Returns:
        int - The index of the element if found, otherwise -1
*/
    static int linearSearch(int[] arr, int target) {
        if(arr.length == 0)
            return -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target)
                return i;
        }
        return -1;
    }
}
