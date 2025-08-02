public class FunctionWithArrayParam {
    static int sum(int[] arr)
    {
        int sum = 0;
        for(int i : arr)
            sum += i;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(FunctionWithArrayParam.sum(new int[] {1,2,3,4,5}));

        //We can directly pass an array without creating it using below syntax
        //Syntax: new data_type {values separated by comma}
    }
}

