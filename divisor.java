import java.util.Scanner;
class divisor
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=500000;i++)
        {
            if(n%i==0)
            {
              count++;  
            }
        }
        System.out.println(count+",");
    }
}
