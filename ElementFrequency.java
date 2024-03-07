package Class_Arrays;
import java.util.Arrays;
public class ElementFrequency 
{
    public static void main(String []args)
    {
        System.out.println("Finding element frequency in Array : ");
        int arr[] = {2,3,4,4,5,6,7,8,7};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int newArr[] = new int[arr.length];
        for(int i=0 ; i<arr.length ; i++)
        {
            int count = 0;
            for(int j=0 ; j<arr.length ; j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;    
                }
            }
        System.out.println("Element "+arr[i]+" occured "+count+" times");
        i = i+(count-1);
        }
        
        
    }   
}
