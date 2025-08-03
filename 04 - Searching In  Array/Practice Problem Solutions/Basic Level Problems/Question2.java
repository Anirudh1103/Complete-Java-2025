public class Question2 {
    //Check if an Item Exists in the List
    public static void main(String[] args) {
        System.out.println(linearSearch(new int[] {7, 8, 9}, 8));
        System.out.println(linearSearch(new int[] {1, 2, 3}, 4));
        System.out.println(linearSearch(new int[] {5}, 5));
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
    static String linearSearch(int[] arr, int target) {
        if(arr.length == 0)
            return "No";
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target)
                return "Yes";
        }
        return "No";
    }
}
