/*Que- Search the element by the user choice and
       give back the index position of that
       element. If the element is not present
       print the "Element is not found" as statement.*/

package Class_Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class BinarySearch 
{
    
    public static void binarySearch(int arr[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Given Array is : "+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted array is :"+ Arrays.toString(arr));
        System.out.print("Enter the element to search : ");
        int searchEle = sc.nextInt();
        int low = 0;            //1 2 55 77 89
        int high = arr.length;
        int middle = (low+high)/2;
        while(low<high)
        {
            if(searchEle == arr[middle])
            {
                System.out.println("Found element at position "+middle);
                break;
            }
            else if(searchEle > arr[middle])
            {
                low = middle+1;
            }
            else
            {
                high = middle-1;
            }
        middle = (low+high)/2;   
        }
    }
    
    public static void main(String []args)
    {
        System.out.println("BINARY SEARCH");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int size = sc.nextInt();
        System.out.println("Enter "+size+" elements in the array.");
        int arr[] = new int[size];
        for(int i=0 ; i<arr.length ; i++)
        {
            System.out.print("Enter element "+i+" :");
            arr[i] = sc.nextInt();
        }
        binarySearch(arr);
        
    }
    
    
}
