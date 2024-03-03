package Class_Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class RemoveDuplicate
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = {3,4,3,6,7,8,9};
        System.out.println("Given array is : "+Arrays.toString(arr));
        System.out.print("Enter element to remove : ");
        int newArr[] = new int[arr.length];
        int ele = sc.nextInt();
        int index=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=ele)
            {
                newArr[index]=arr[i];
                index++;
            }
            
        }
        System.out.println(Arrays.toString(newArr));
    }
    
    
}
