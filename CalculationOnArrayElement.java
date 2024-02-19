package Class_Arrays;
import java.util.Arrays;
public class CalculationOnArrayElement 
{
    public int[] calc(int a[])
    {
        int sum=a[0],sub=a[0],mul=a[0];
        for(int i=1;i<a.length;i++)
        {
            sum+=a[i];
            sub-=a[i];
            mul*=a[i];
        }
        int []b = {sum,sub,mul};
        return b;
    }
    
    public static void main(String []args)
    {
        int []arr = {10,20,30};
        CalculationOnArrayElement c = new CalculationOnArrayElement();
        int []result = c.calc(arr);
        System.out.println(Arrays.toString(result));
    }
    
}
