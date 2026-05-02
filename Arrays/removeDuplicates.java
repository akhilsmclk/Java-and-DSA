package Arrays;

import java.util.*;

public class removeDuplicates 
{
    public void removeDups(int[] arr)
    {
        int index = 0;
        int[] result = new int[arr.length];

        Arrays.sort(arr);

        result[index++] = arr[0];

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]!=arr[i-1])
              result[index++] =arr[i];    
        }

        result = Arrays.copyOf(result, index);
        System.out.println("Array after remove the duplicates" + Arrays.toString(result));
    }

    public static void main(String[] args)
    {
        //int[] arr = {1,5,8,0,11,5,6,1,7,5,9,4,1};
        int[] arr = {-1,0,1,0,1,0,1,-1};

        removeDuplicates rd = new removeDuplicates();

        rd.removeDups(arr);
    }
    
}
