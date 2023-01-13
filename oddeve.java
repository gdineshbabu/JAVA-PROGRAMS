import java.util.Scanner;
class oddeve
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int e,o;
        if(n%2==0)
        {
            e=n*8;
            System.out.println(e);
        }
        else
        {
            if(n%2!=0)
            {
                o=n*9;
                System.out.println(o);
            }
        }
    }
}
