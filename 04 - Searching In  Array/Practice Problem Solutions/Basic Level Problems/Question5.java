public class Question5 {
    //  Check if Any Element Equals Its Index
    public static void main(String[] args) {
        System.out.println(isAnyElementEqualsToItsIndex(new int[] {-1, 0, 2, 4}));
        System.out.println(isAnyElementEqualsToItsIndex(new int[] {1, 2, 3}));
        System.out.println(isAnyElementEqualsToItsIndex(new int[] {0, 2, 5}));
    }
    static boolean isAnyElementEqualsToItsIndex(int[] arr)
    {
        if(arr.length != 0)
        {
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == i)
                    return true;
            }
        }
        return false;
    }
}
