package Class_Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class RotateArray 
{  
    //main logic of array rotation in rotateArray method
    public static int[] rotateArray(int arr[])
    {
        for(int i=0 , j=arr.length-1; i<arr.length/2 ; i++ , j--)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //after rotation returning array
        return arr;
    }
    
    public static void main(String []args)
    {
    Scanner sc = new Scanner(System.in);
    //Size of array 
    System.out.print("Enter the size of the array : ");
    int size = sc.nextInt();
    //array creation 
    int arr[] = new int[size];
    //entering element in array using for loop
    System.out.println("Enter the elements in the array");
    for(int i=0 ; i<arr.length ; i++)
    {
        System.out.print("Enter element "+i+" :");
        arr[i] = sc.nextInt();
    }
    //array before rotation
    System.out.println("Before rotation : "+Arrays.toString(arr));
    //calling static method which contain array rotation logic
    int rotatedArray[] = rotateArray(arr);
    //array after rotation
    System.out.println("After rotation : "+Arrays.toString(rotatedArray));
    }
}
