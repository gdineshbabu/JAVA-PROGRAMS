import java.util.Scanner;
public class Student2
{
    public static void main(String[] args)
    {
        //Write your code
        Scanner sc=new Scanner(System.in);
        String n1=sc.next();
        int a=sc.nextInt();
        String d1=sc.next();
        
        
        String n2=sc.next();
        int b=sc.nextInt();
        String d2=sc.next();
        System.out.println("Students details:");
        System.out.println("Students Name: \n"+n1+"\n"+n2);
        System.out.println("Students ID: \n"+a+"\n"+b);
        System.out.println("Students Departments: \n"+d1+"\n"+d2);
        
    }
}
