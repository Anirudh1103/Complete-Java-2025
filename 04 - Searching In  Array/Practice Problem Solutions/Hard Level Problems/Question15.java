public class Question15 {
    //  Sparse Linear Search (with empty strings)
    public static void main(String[] args) {
        System.out.println(linearSearchOnStrings(new String[] {"", "cat", "", "", "dog"}, "dog"));
        System.out.println(linearSearchOnStrings(new String[]{"", "", "", "apple"}, "apple"));
        System.out.println(linearSearchOnStrings(new String[]{"", "", "", ""}, "test"));
    }

    static int linearSearchOnStrings(String[] arr, String key)
    {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(key))
                return i;
        }
        return -1;
    }
}
