public class Question13 {
    //   Find Missing Number from 1 to n in a sorted array
    public static void main(String[] args) {
        System.out.println(findMissingNumber(new int[] {1, 2, 4}, 4));
        System.out.println(findMissingNumber(new int[] {2, 3, 4, 5}, 5));
        System.out.println(findMissingNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 9}, 9));
    }
    static int findMissingNumber(int[] arr, int n)
    {
        int expectednNumber = 1;
        for (int i = 0; i < arr.length; i++, expectednNumber++) {
            if(arr[i] != expectednNumber)
                return expectednNumber;
        }
        return n;
    }
}
