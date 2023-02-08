import java.util.*;
public class keep{

  public static int Liters(double time)  {
    
     
    //write your logic here
    int Liters=(int)time/2;
    return Liters;
  
  }

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
double b=sc.nextDouble();
System.out.println(Liters(b));
}}
