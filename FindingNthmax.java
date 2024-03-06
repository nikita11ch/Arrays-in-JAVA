package Class_Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class FindingNthmax 
{
    public static void findMax(int arr[],int max)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(i==max-1)
            {
                System.out.println("The "+max+" element is "+arr[i]);
                break;
            }
                
        }
    }
    
    
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = {22,4,6,77,1,67};  
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the nth max to find");
        int max = sc.nextInt();
        findMax(arr,max);
        
        
    } 
}
