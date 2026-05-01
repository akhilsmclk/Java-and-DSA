//Problem : Find the largest element in an array

package Arrays;

public class maxElement 
{
   int max = Integer.MIN_VALUE;

   public int largest(int[] arr)
   {
      for(int nums: arr)
      {
        if(nums > max)
            max = nums;
      }

      return max;
   } 

   public static void main(String[] args)
   {
      int[] arr = {2,3,4,0,-1,6,8};

      maxElement me = new maxElement();

      System.out.println("The largest element in an array is "+ me.largest(arr));
   }
}

