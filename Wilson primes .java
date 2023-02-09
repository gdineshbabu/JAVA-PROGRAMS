import java.util.*;
public class Wilson{
  public static boolean am_i_wilson(double n) {
    //write your logic here
   
    
    int fact=1;
    for(int i=1;i<n;i++)
    {
        fact=fact*i;
    }
    double b=(fact+1)/(n*n);
    boolean am_i_wilson;;
    if(b==1)
    {
        am_i_wilson=true;
    }
    else
    {
        am_i_wilson=false;
    }
    return am_i_wilson;
 
  }
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
double a=sc.nextDouble();
System.out.println(am_i_wilson(a));
}}
