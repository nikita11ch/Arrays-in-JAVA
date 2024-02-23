 /* Q. Write a java program to sort the array in descending order
and print the array without using a for loop ?*/

package Class_Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class DescendingSort
{
    //main logic for sorting array in descending order
    public static int[] descendingSort(int arr[])
    {
        //This loop is for holding position & telling total length of array
        for(int i=0 ; i<arr.length ; i++)
        {
            //This loop is for performing iteration
            for(int j=i+1 ; j<arr.length ; j++)
            {
                //checking condition if true then performing swapping
                if(arr[i]<arr[j])
                {
                    //simple swapping logic with 3rd variable i.e. temp here
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        //Returning back the sorted array
        return arr;
    }
    
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        //Taking size of array from user
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        //Creating a integer array with user given size
        int arr[] = new int[size];
        //Taking element from user
        System.out.println("Enter "+size+" elements in the array.");
        for (int i=0 ; i<arr.length; i++)
        {
            System.out.print("Enter "+i+" element : ");
            arr[i] = sc.nextInt();
        }
        //Printing array before descending sort
        System.out.println("Before Array Sorting : "+Arrays.toString(arr));
        //Calling the descendigSort method for sorting array
        int sortedArray[] = descendingSort(arr);
        //Printing array after descending sort
        System.out.println("After Array Sorting :"+Arrays.toString(sortedArray));
    }
}

    
