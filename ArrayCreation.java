package Class_Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayCreation 
{
    public static void main(String []args)
    {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the Array : ");
    int size = sc.nextInt();
    int arr[] = new int[size];
    System.out.println("Enter "+size+" elemets in the array.");
    for(int i=0;i<arr.length;i++)
    {
        System.out.print("Element "+i+" : ");
        arr[i] = sc.nextInt();
    }
    System.out.println("The elements in the array are : "+Arrays.toString(arr));
    }
}
