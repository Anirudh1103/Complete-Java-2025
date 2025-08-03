public class Question6 {
    //Find Smallest and Largest Element
    public static void main(String[] args) {
        System.out.println(findMin(new int[] {-5, 100, 0, 3}));
        System.out.println(findMax(new int[] {-5, 100, 0, 3}));
        findMaxAndMin(new int[] {-5, 100, 0, 3});
    }
    static int findMin(int[] arr)
    {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min)
                min = arr[i];
        }
        return min;
    }
    static int findMax(int[] arr)
    {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    }
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
}
