public class Question14 {
    //  First Non-Repeating Element
    //  Constraint: 0 > arr > 1000
    public static void main(String[] args) {
        System.out.println(firstNonRepeatingElement(new int[] {1, 2, 2, 3, 1}));
        
    }
    static int firstNonRepeatingElement(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j]) count++;
            }

            if(count == 1)
                return arr[i];
        }
        return -1;
    }
}
