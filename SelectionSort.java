/*Write the java program to show Selection sorting in java and print the
sorted array without using a for loop ?*/
package Class_Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class SelectionSort
{
    //main logic of selectionSort(Searching + Sorting)
    public static int[] selectionSort(int arr[])
    {
        for(int i=0 ; i<arr.length ; i++)
        {   
            int hold = i;
            for(int j=i+1 ; j<arr.length ; j++)
            {
                if(arr[j]<arr[hold])
                {
                    hold = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[hold];
            arr[hold] = temp;  
        }
        return arr;
    }
    
    public static void main(String []args)
    {
        System.out.println("SELECTION SORTING");
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
        //Printing array before selectionSort
        System.out.println("Before Array Sorting : "+Arrays.toString(arr));
        //Calling the selectionSort method for sorting array
        int sortedArray[] = selectionSort(arr);
        //Printing array after selectionSort
        System.out.println("After Array Sorting :"+Arrays.toString(sortedArray));
    }
    
}
