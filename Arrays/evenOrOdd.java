//Problem: Find out a number is even or odd.
package Arrays;

import java.util.Scanner;

public class evenOrOdd
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to check whether it is even or odd : ");

        int num = sc.nextInt();

        if ((num & 1) == 1) {
            System.out.println("The number is odd");
        } else {
            System.out.println("The number is even");
        }

        sc.close();
    }
}