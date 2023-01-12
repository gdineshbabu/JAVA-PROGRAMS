import java.util.Scanner;
class Constructor2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Name");
        String s1=sc.nextLine();
        System.out.println("Id");
        int s2=sc.nextInt();
        System.out.println("Department");
        String s3=sc.next();
        System.out.println("Original:-");
        System.out.println("Id: "+s2);
        System.out.println("Name: "+s1);
        System.out.println("Department Id: "+s2);
        System.out.println("Department: "+s3);
        
        System.out.println("Duplicate:-");
        System.out.println("Id: "+s2);
        System.out.println("Name: "+s1);
        System.out.println("Department Id: "+s2);
        System.out.println("Department: "+s3);
        
        
    }
}
