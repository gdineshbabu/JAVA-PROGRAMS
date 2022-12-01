import java.util.Scanner;
public class Area
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);

     int a=sc.nextInt();

     int b=sc.nextInt();

     int c=sc.nextInt();

     float d=sc.nextFloat();

     double e=(3.142*d*d)*100;

     System.out.println(a*a);

       System.out.println(b*c);

       System.out.printf("%.02f",Math.floor(e)*0.01);
       
    }
}


