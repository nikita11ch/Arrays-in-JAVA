package Class_Arrays;
import java.util.Scanner;
public class ArrayCreation_2D_Array 
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int [2][3];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print("Enter ["+i+"]["+j+"] element :");
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.println("Element ["+i+"]["+j+"] is :"+arr[i][j]);
            }
        }
        sc.close();
    }
    
}
