// Problem : Move all the zeros in the array to the end of an array 
// without disturbing the order of an elements

package Arrays;

import java.util.Arrays;

public class moveZerosToEnd 
{
    public int[] MoveZero(int arr[])
    {
       int index=0;
       
       //Check the non zero elemnts and shift left
       for(int i=0;i<arr.length;i++)
       {
          if(arr[i]!=0)
          {
            arr[index++] = arr[i];
          }
       }

       //Fill the remaining slots by zeros
       while(index<arr.length)
       {
          arr[index++] = 0;
       }

       return arr;
    }

    public static void main(String[] args)
    {
        int[] arr = {5,0,62,7,1,0,9,0,-5,0,0,-52,4,-8};

        moveZerosToEnd mz = new moveZerosToEnd();

        int[] result = mz.MoveZero(arr);

        System.out.println(Arrays.toString(result));
    }
}
