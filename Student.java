import java.util.Scanner;
class Student
{
    public static void main(String[] args)
    {
        //Write your code
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        int a=sc.nextInt();
        String d=sc.next();
        System.out.println("Student details:");
        System.out.println("Student name: "+n);
        System.out.println("Student ID: "+a);
        System.out.println("Department: "+d);
    }
}
