public class LinearSearchInRange {
    public static void main(String[] args) {
        System.out.println(linearSearchInRange(new int[] {18,19,21,25,16,32},16,0,4));
    }
    /*
    Description:
        This method performs a linear search to find the index of a target element within
        the given range in an integer array. It checks each element one by one from left to right.

    Params:
        int[] arr - The array in which to search
        int key   - The element to search for
        int start - Starting index of range
        int end - Ending index of range

    Returns:
        int - The index of the element if found, otherwise -1
*/
    static int linearSearchInRange(int[] arr, int target, int start, int end)
    {
        if(arr.length == 0)
            return -1;
        for(int i = start; i<= end; i++)
            if(arr[i] == target)
                return i;
        return -1;
    }
}
