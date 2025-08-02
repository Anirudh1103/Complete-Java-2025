import java.util.Arrays;

public class BasicQuestion1 {
    //Program to swap elements of an Array

    static void swap(int[] arr, int index1, int index2)
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5};
        System.out.println("Before swapping: " + Arrays.toString(arr));
        swap(arr,0, arr.length-1);
        System.out.println("After swapping: " + Arrays.toString(arr));
    }
}
