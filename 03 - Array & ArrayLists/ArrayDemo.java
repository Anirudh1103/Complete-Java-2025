import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        /*
            Array Declaration Syntax
            data_type[] variable_name = new data_type[size];

            if we don't want to define size at the declaration
            data_type[] variable_name;

            then later when we want to allocate size of array
            variable_name = new data_type[size];

            Array indexes start from 0 and ends at n-1
         */

        // Array of size 5 indexes start from 0 till 4 (ie n-1)
        int[] arr = new int[5];

        //Assigning values
        arr[0] = 1;
        arr[1] = 2;

        //we can even use for loop to assign values

        for(int i = 0; i< arr.length; i++)
            arr[i] = i+1;

        System.out.println(Arrays.toString(arr));
        //Arrays library provides some operations that can be performed on arrays
        // .toString provides a way to print entire array in String form without using loop

    }
}
