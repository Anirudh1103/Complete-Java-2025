import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfObjects {
    public static void main(String[] args) {

        String[] arr = new String[5];
        Scanner ip = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ip.nextLine();
        }

        System.out.println(Arrays.toString(arr));
    }
}
