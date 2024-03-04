package Class_Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class RemovingElement 
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = {3,4,5,6,7,8,9};
        System.out.println("Given array is : "+Arrays.toString(arr));
        System.out.print("Enter element to remove : ");
        int ele = sc.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==ele)
            {
                for(int j=i;j<arr.length-1;j++)
                {
                    arr[j] = arr[j+1];
                }
            }
            
        }
        int newArr[] = Arrays.copyOf(arr,arr.length-1);
            System.out.println(Arrays.toString(newArr));
    }
    
    
}
