package Class_Arrays;
import java.util.Arrays;
public class MissingElement 
{
    public static void missingElement(int arr[])
    {
       if(arr[0]==1)
       {
           for(int i=0;i<arr.length-1;i++)
           {
               for(int j=arr[i];j<arr[i+1];j++)
               {
                   if(j!=arr[i])
                   {
                       System.out.println("Missing element is "+j);
                   }
               }
           }
       }
       else
       {
           System.out.println("Missing element is 1");
           if(arr[0]==1)
       {
           for(int i=0;i<arr.length-1;i++)
           {
               for(int j=arr[i];j<arr[i+1];j++)
               {
                   if(j!=arr[i])
                   {
                       System.out.println("Missing element is "+j);
                   }
               }
           }
       }
       }
	
    }
    
    public static void main(String []args)
    {
        System.out.println("Missing Element :");
        int arr[] = {1,4,6};
        Arrays.sort(arr);
        System.out.println("Given array is : "+ Arrays.toString(arr));
        missingElement(arr);
    }
}

    
    
    
    

