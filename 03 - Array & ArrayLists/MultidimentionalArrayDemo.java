import java.util.Arrays;
import java.util.Scanner;

public class MultidimentionalArrayDemo {

    /*
        Structure or indexes
        [
            [00 01  02  ..]
            [10 11  12  ..]
            [20 21  22  ..]
            [.. ..  ..  ..]
        ]
     */
    public static void main(String[] args) {
        int[][] arr = new int[3][3];

        //  2-D array input
        Scanner ip = new Scanner(System.in);
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = ip.nextInt();
            }
        }

        // Printing 2-D array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
