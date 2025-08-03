public class Question3 {
    //Count Occurrences of an Element
    public static void main(String[] args) {
        System.out.println(countOccurrences(new int[] {1, 2, 2, 3}, 2));
        System.out.println(countOccurrences(new int[] {4, 4, 4, 4}, 4));
        System.out.println(countOccurrences(new int[] {1, 2, 3}, 5));
    }
    static int countOccurrences(int[] arr, int key)
    {
        if(arr.length == 0)
            return 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key)
                count++;
        }
        return count;
    }
}
