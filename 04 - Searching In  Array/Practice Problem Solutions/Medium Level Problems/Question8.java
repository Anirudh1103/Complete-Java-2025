public class Question8 {
    //Search in a Rotated Sorted Array
    public static void main(String[] args) {
        System.out.println(searchInRotatedSortedArray(new int[] {4, 5, 6, 1, 2}, 1));
    }
    static int searchInRotatedSortedArray(int[] arr, int target)
    {
        if(arr.length == 0)
            return -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target)
                return i;
        }
        return -1;
    }
}
