import java.util.Arrays;

public class BasicQuestion3 {
    //  Program to reverse an array
    static void reverseArray(int[] arr)
    {
        int i=0, j = arr.length-1;
        while (i < j)
        {
            swap(arr,i++,j--);
        }
    }
    //The below method is Solution of BasicQuestion1
    static void swap(int[] arr, int index1, int index2)
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println("Before reversing: " + Arrays.toString(arr));
        reverseArray(arr);
        System.out.println("After reversing: " + Arrays.toString(arr));
    }
}
