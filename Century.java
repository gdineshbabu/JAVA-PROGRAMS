import java.util.*;
public class Century{
  public static int century(int number) {
      
    //write your logic here
    int century;
    if(number%100==0)
    {
        century=number/100;
    }
    else
    {
        century=number/100+1;
    }
    return century;
    
    }

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
System.out.println(century(number));
}}
