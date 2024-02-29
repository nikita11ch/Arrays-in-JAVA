/*Que- Search the element by the user choice and
       give back the index position of that
       element. If the element is not present
       print the "Element is not found" as statement.*/

package Class_Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class LinearSearch 
{
    
    public static void linearSearch(int arr[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Given Array is : "+Arrays.toString(arr));
        System.out.print("Enter the element to search : ");
        int searchEle = sc.nextInt();
        int flag = 0;
        for(int i=0 ; i<arr.length ; i++)
        {
            if(searchEle == arr[i])
            {
                flag = 1;
                System.out.println("Element "+searchEle +" found at position "+i);
                break;
            }       
        }
        if(flag == 0)
        {
            System.out.println("Element Not Found");
        }
    }
    
    public static void main(String []args)
    {
        System.out.println("LINEAR SEARCH");
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
        linearSearch(arr);
        
    }
    
    
}
