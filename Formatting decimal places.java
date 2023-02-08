import java.util.*;
public class Decimal
{
  public static void TwoDecimalPlaces(double number)
  {
    
      
    System.out.printf("%.2f",number);
    
  }

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
Decimal d=new Decimal();
double b=sc.nextDouble();
d.TwoDecimalPlaces(b);
}}
