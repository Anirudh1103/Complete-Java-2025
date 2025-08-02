import java.util.Arrays;
import java.util.Scanner;

public class ArrayInputDemo {
    public static void main(String[] args) {
        int[] arr = new int[5];

        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the elements of array: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element - " + (i+1) + ":");
            arr[i] = ip.nextInt();
        }

        System.out.println(Arrays.toString(arr));
    }
}
