public class BasicQuestion2 {
    // Program to find Maximum & Minimum element of an array
    /*
        The below provided solution is better than creating two different methods
        findMax() & findMin() because the below method uses only one for loop to
        find both minimum & maximum element of array.

        Advantage: Only one for loop is used therefore efficient solution.
        Disadvantage: The method is not returning the value it's just finding
                      the values and printing them. If we need those values in
                      our program to perform further operations then going with
                      two different methods that return those values is better.
     */
    static void findMaxAndMin(int[] arr)
    {
        int max = arr[0], min =  arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
            if(arr[i] < min)
                min = arr[i];
        }
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        findMaxAndMin(arr);
    }
}
