import java.util.Scanner;
class Employee
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a;
        int c;
        System.out.print("Enter employee's basic info: \n ");
        System.out.print("\nEnter Name: ");
        String n=sc.nextLine();
        System.out.print("\nEnter Emp. Id: ");
        int i=sc.nextInt();
        System.out.print("\nEnter Gender: ");
        String g=sc.next();
        System.out.print("\nEnter employee's department info: \n");
        System.out.print("\nEnter Department Name: ");
        String d=sc.next();
        
        
        
        System.out.print("\nEnter assigned work: ");
        a=sc.next();
        
        
        System.out.print("\nEnter time in hours to complete work:");
        c=sc.nextInt();
        System.out.println("\nEmployee's Information is:");
        System.out.println("Basic Information...: ");
        System.out.println("Name: "+n);
        System.out.println("Employee ID: "+i);
        System.out.println("Gender: "+g);
        System.out.println("");
        System.out.println("");
        System.out.println("Department Information...:  ");
        System.out.println("Department Name: "+d);
        System.out.println("Assigned Work: "+a);
        System.out.println("Time to complete work: "+c);
    }
}
