public class Question1 {
    // Search for an Element in an Array
    public static void main(String[] args) {
        System.out.println(linearSearch(new int[] {3, 5, 2, 9, 1}, 9));
        System.out.println(linearSearch(new int[] {1, 2, 3, 4, 5}, 6));
        System.out.println(linearSearch(new int[] {10, 20, 30}, 10));
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
