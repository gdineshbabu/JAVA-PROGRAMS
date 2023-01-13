import java.util.Scanner;
class payroll
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of employee:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
        System.out.print("\nEnter the employee number:");
        int e=sc.nextInt();
        System.out.print("\nEnter the employee name:");
        String a=sc.next();
        System.out.print("\nEnter the designation:");
        String d=sc.next();
        System.out.print("\nEnter the basic pay:");
        int p=sc.nextInt();
        System.out.print("\nEnter the Humen Resource Allowance:");
        int h=sc.nextInt();
        System.out.print("\nEnter the Dearness Allowance :");
        int r=sc.nextInt();
        System.out.print("\nEnter the Profitablity Fund:");
        int f=sc.nextInt();
        System.out.println("\ne_no     e_name  des      bp       hra      da       pf  \n np");
        int np=p+r;
        System.out.print(e+"  "+a+"  "+d+"  "+p+"  "+h+"  "+r+"  "+f+"  "+np);
        }
    }
}
