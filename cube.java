import java.util.Scanner;
class cube
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the side : ");
        int n=sc.nextInt();
        int a=n*n;
        int b=n*n*n;
        System.out.println("\nThe square value is : "+a);
        System.out.print("The cube value is : "+b);
    }
}
