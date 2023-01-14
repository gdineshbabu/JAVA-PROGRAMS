import java.util.*;
public class Cockroach{
  public static int cockroachSpeed(double x){
    //write your logic here
    int cockroachSpeed=(int)( x*28.00);
    return cockroachSpeed;
  }

  
  
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
double x=sc.nextDouble();
System.out.println(cockroachSpeed(x));
}}
