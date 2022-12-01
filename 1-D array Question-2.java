//code here
import java.util.Scanner;
import java.util.Arrays;
public class Summinmax
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=10;
        int[] a=new int[n];
        int i,c=0;
       
       
        
        System.out.println("Enter 10 array elements");
        for( i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            
        }
        for(i=0;i<n;i++)
        {
            c=c+a[i];
        }
        System.out.println("Array:");
        System.out.println("sum: "+c);
         int min=a[0];
         for(i=0;i<n;i++)
        {
          if(a[i]<min)
          
          {
              min=a[i];
          }
        }
         int max=a[0];
        for(i=0;i<n;i++)
        {
          if(a[i]>max)
          {
              max=a[i];
          }
        }
        System.out.println("min: "+min);
        System.out.println("max: "+max);
        double d=c/10.0;
        System.out.println("average : "+d);
      
    }
}
