package Class_Arrays;
import java.util.Arrays;
public class ArrayCopy
{
    public static void main(String []args)
    {
        int a[] = {1,2,3,4};
        int b[] = new int[a.length];
        for(int i=0 ; i<a.length; i++)
        {
            b[i] = a[i];
        }
        System.out.println("Element in b Array : "+Arrays.toString(b));
    }
    
}
