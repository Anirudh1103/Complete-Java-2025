public class Question12 {
    //   Find Majority Element (More than n/2 times)

    public static void main(String[] args) {
        int result = findMajorityElement(new int[] {1,2,3});
        System.out.println(result == -1 ? "None" : result);
    }
    static int findMajorityElement(int[] arr)
    {
        int maxCount = 1, target = arr[0];

        for(int i=0; i< arr.length; i++)
        {
            int currCount = 1;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    currCount++;

            }
            if(currCount > maxCount)
            {
                maxCount = currCount;
                target = arr[i];
            }
        }
        if(maxCount  > arr.length/2)
            return target;
        return -1;
    }
}
