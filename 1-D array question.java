//code here
import java.util.Scanner;
public class  Array
{
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n=10;
      int[] a=new int[n];
      int i;
      System.out.println("Enter 10 numbers");
      for( i=0;i<n;i++)
      {
         a[i]=sc.nextInt();
      }
      System.out.println("List of even numbers");
      for( i=0;i<n;i++)
      {
           if(a[i]%2==0)
          {
              
              System.out.print(a[i]+" ");
          }
      }
    }
}
