import java.util.Scanner;
class instructor
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No. of Instructor Details You Want :  ");
        int n=sc.nextInt();
        int d,i;
        String a,s,t,dn;
        for(i=1;i<=n;i++)
        {
            System.out.print("\nEnter Id  :  ");
            d=sc.nextInt();
            System.out.print("\nEnter Name :  ");
            a=sc.next();
            System.out.print("\nEnter Subject Name :  ");
            s=sc.next();
            System.out.print("\nEnter Teacher Name :  ");
            t=sc.next();
            System.out.print("\nEnter Department Name :  ");
            dn=sc.next();
            System.out.println("Id : "+d);
            System.out.println("Name : "+a);
            System.out.println("Subject Name : "+s);
            System.out.println("Teacher Name : "+t);
            System.out.println("Department Name : "+dn);
        }
    }
}
