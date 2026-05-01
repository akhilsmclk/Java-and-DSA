//Problem : Find the second largest element of an array.

package Arrays;

public class secondLargestElement 
{
    public int secondLargest(int[] arr)
    {
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
             if(arr[i]>largest)
                {
                    second_largest = largest;
                    largest = arr[i];
                }
            else if(arr[i]>second_largest && arr[i]!=largest)
            {
                second_largest = arr[i];
            } 
        }

        return second_largest;
    }

    public static void main(String[] args)
    {
        int[] arr = {3,-8,2,56,4,25,87,58,2,6,4,};

        secondLargestElement sec = new secondLargestElement();

        int result = sec.secondLargest(arr);

        System.out.println("The second largest element in an array is " +result);
    }
}
