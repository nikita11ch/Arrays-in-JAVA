/*Given an array of integers length 3, figure out which is larger, 
the first or last element in the array, and set all the other elements 
to be that value. Return the changed array.
*/
package Class_Arrays;
import java.util.Arrays;
public class FindLarge 
{
    public static int[] findLarge(int arr[])
    {
        if(arr[0]>arr[arr.length-1])
        {
            for(int i=1 ; i<arr.length ; i++)
            {
                arr[i] = arr[0];
            }
        }
        else
        {
            for(int i=0 ; i<arr.length-1 ; i++)
            {
                arr[i] = arr[arr.length-1];
            }     
        }
        return arr;
    }
    
    
    public static void main(String []args)
    {
        int arr[] = {3,4,2};
        System.out.println("Before finding largest element : "+Arrays.toString(arr));
        int modifiedArray[] = findLarge(arr);
        System.out.println("After finding largest element : "+Arrays.toString(modifiedArray));
    }
    
}
