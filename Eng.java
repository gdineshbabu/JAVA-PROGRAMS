import java.util.Scanner;
class Eng
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first name = ");
        String n=sc.next();
        System.out.print("\nEnter the identity number = ");
        int i=sc.nextInt();
        System.out.print("\nEnter the age = ");
        int a=sc.nextInt();
        System.out.print("\nEnter the salary = ");
        int s=sc.nextInt();
        System.out.print("\nEnter the designation of the Engineer: ");
        String d=sc.next();
        System.out.println("\nDisplaying the particulars of the Engineer  ");
        System.out.println("Name = "+n);
        System.out.println("Identity Number = "+i);
        System.out.println("Age = "+a);
        System.out.println("Salary = "+s);
        System.out.println("Designition = "+d);
    }
}
