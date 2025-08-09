public class LinearSearchOnStrings {
    public static void main(String[] args) {
        System.out.println(linearSearchString("Anirudh", 't'));
    }
    /*
        Description:
        This method performs a linear search to find if the target character is present
        within the string or not.

        Params:
            String str - The String where search operation to be performed
            char target - Character to be found in string.

        Returns:
            true - if character  is found.
            false - if character is not found.
     */
    static boolean linearSearchString(String str, char target)
    {
        if(str.isEmpty())
            return false;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == target)
                return true;
        }
        return false;
    }
}
