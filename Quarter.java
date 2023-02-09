import java.util.*;
public class Quarter{
    public static int quarterOf(int month) 
    {
        //write your logic here
        int quarterOf=month/4+1;
        return quarterOf;
    }

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
System.out.println(quarterOf(a));
}}
