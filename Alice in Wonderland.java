import java.util.Scanner;
public class Alice
{
    public static void main(String args[])
    {
        //write your code
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
     int temp,sum=0,digit;
     while(a>0)
     {
         digit=a%10;
         sum=sum+digit;
         a=a/10;
     }
     System.out.println(sum);
    }
}
