package Class_Arrays;
import java.util.Arrays;
public class ArrayMerge 
{
    public static void main(String []args)
    {
        int a[] = {1,2,3,4};
        int b[] = {5,6,7,8};
        int merge[] = new int[a.length +b.length];
        int index=0;
        for(int i=0;i<a.length;i++)
        {
            merge[index] = a[i];
            index++;
        }
        for(int i=0;i<b.length;i++)
        {
            merge[index] = b[i];
            index++;
        }
        System.out.println("Array elements are : "+Arrays.toString(merge));
    }
    
}
