//Problem : Reverse an array

package Arrays;

import java.util.*;

public class reverseArray 
{
    public void reverse(int[] arr)
    {
        int left =0;
        int right = arr.length-1;
        int temp;

        while(left<right)
        {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.println("The reverse array is"+ Arrays.toString(arr));
    }

    public static void main(String[] args)
    {
        int[] arr = {5,8,2,0,5,-2,-1,7,4};

        System.out.println("The given array is " + Arrays.toString(arr));

        reverseArray rev = new reverseArray();

        rev.reverse(arr);
    }
}
