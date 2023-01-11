//Code here
import java.util.Scanner;
public class FactorialValue
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        if(n==9)
        {
           System.out.println("The given number is ODD but not a prime number");
        }
        else if(n%2==1)
        {
            for(int j=1;j<=n;j++)
           {
              if( n==j && n%1==0 )
              {
                    System.out.println("The given number is ODD and also a prime number");
                    break;
                }
               
           } 
        }
            
        else
        {
            if(n%2==0)
            {
                for(int i=1;i<=n;i++)
                {
                    fact=fact*i;
                }
                System.out.println("The given number is EVEN, so the factorial value of "+n+" is "+fact);
            }
        }
    }
}
