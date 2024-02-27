/*Write the java program to show Bubble sorting in java and print the
sorted array without using a for loop ?*/
package Class_Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort
{
    //main logic of bubble sort
    public static int[] bubbleSort(int arr[])
    {
        for(int i=0 ; i<arr.length-1 ; i++)
        {
            for(int j=0 ; j<arr.length-1 ; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    
    public static void main(String []args)
    {
        System.out.println("BUBBLE SORTING");
        Scanner sc = new Scanner(System.in);
         // Taking size of array from user with input validation
        int size;
        do {
            System.out.print("Enter the size of the array (greater than 0): ");
            size = sc.nextInt();
        } 
        while (size <= 0);
        //Creating a integer array with user given size
        int arr[] = new int[size];
        //Taking element from user
        System.out.println("Enter "+size+" elements in the array.");
        for (int i=0 ; i<arr.length; i++)
        {
            System.out.print("Enter "+i+" element : ");
            arr[i] = sc.nextInt();
        }
        //Printing array before bubbleSorting
        System.out.println("Before Array Sorting : "+Arrays.toString(arr));
        //Calling the bubbleSort method for sorting array
        int sortedArray[] = bubbleSort(arr);
        //Printing array after bubbleSorting
        System.out.println("After Array Sorting :"+Arrays.toString(sortedArray));
    }
    
}
