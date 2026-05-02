package Arrays;

import java.util.Arrays;

public class intersectionOfArrays 
{
    public void intersect(int [] arr1, int[] arr2)
    {
        int[] result = new int[Math.min(arr1.length, arr2.length)];
        int index=0;

        for(int i=0;i<arr1.length-1;i++)
        {
            for(int j=0;j<arr2.length-1;j++)
            {
                if(arr1[i] == arr2[j])
                    result[index++] = arr1[i];
            }
        }

        result = Arrays.copyOf(result, index);

        System.out.println(Arrays.toString(result));
        
    }

    public static void main(String[] args)
    {
        int[] arr1 = {1,89,3,12,8,0,2,6,5};
        int[] arr2 = {2,4,8,66,5,8};

        intersectionOfArrays in = new intersectionOfArrays();

        in.intersect(arr1, arr2);
    }
    
}
