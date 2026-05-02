package Arrays;

import java.util.Arrays;

public class runningSum 
{
    public int[] sumArray(int[] arr)
    {
        for(int i=1;i<arr.length;i++)
        {
            arr[i] = arr[i] + arr[i-1];
        } 

        return arr;
    }

    public static void main(String[] args)
    {
        int[] arr = {4,5,1,2,8,7,-8,6,-5};

        System.out.println("Given array: " +Arrays.toString(arr));

        runningSum rs = new runningSum();

        rs.sumArray(arr);

        System.out.println("Running sum of an array: " +Arrays.toString(arr));
    }
}
